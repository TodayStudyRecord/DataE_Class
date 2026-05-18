package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;

/**
 * 채팅 클라이언트 (☆ 학생 구현)
 *
 * <pre>
 * 담당자(@assignee): ___________________
 * 작업단위(@task)  : TASK-B
 * 가이드 카드      : docs/tasks/TASK-B_조원_ChatClient.md
 *
 * 능력단위요소 2 / 수행준거 2.2 + 2.4
 * 체크리스트 2-2 (Socket connect + I/O Stream), 2-5 (try-catch-finally)
 * </pre>
 *
 * <p>ChatClientUI 와 연결되는 비-UI 통신 클래스.
 * 서버에서 받은 메시지는 messageListener 콜백으로 UI 채팅창에 전달된다.</p>
 *
 * <p><b>학생 구현 가이드 (정답 코드 ✗ — 가이드만)</b></p>
 * <ol>
 *   <li>connect(): Socket 생성 → in/out 초기화 → 닉네임 송신 → 수신 Thread 시작</li>
 *   <li>send(): out 이 null 이 아니면 println(message)</li>
 *   <li>disconnect(): running = false → in/out/socket close</li>
 *   <li>readLoop() 는 이미 구현되어 있음. connect() 에서 이 메서드를 호출하는 Daemon Thread 만 시작하면 됨.</li>
 * </ol>
 *
 * <p>필요 import (추가): <code>java.io.InputStreamReader</code>, <code>java.io.OutputStreamWriter</code></p>
 */
public class ChatClient {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Thread readerThread;
    private final Consumer<String> messageListener;
    private volatile boolean running = false;

    /**
     * @param messageListener 서버 수신 메시지를 UI 에 전달할 콜백
     */
    public ChatClient(Consumer<String> messageListener) {
        this.messageListener = messageListener;
    }

    /** 서버 접속 */
    public void connect(String host, int port, String nickname) throws IOException {
        // TODO 1) socket = new Socket(host, port);
        // TODO 2) in / out 스트림 초기화 (UTF-8)
        // TODO 3) out 으로 첫 줄에 닉네임 송신
        // TODO 4) running = true; → new Thread(this::readLoop).setDaemon(true) → start()

        throw new IOException("ChatClient.connect() 가 아직 구현되지 않았습니다. (TODO)");
    }

    /** 메시지 송신 */
    public void send(String message) {
        // TODO: out 이 null 이 아니면 println(message)
    }

    /**
     * 수신 루프 — 별도 Thread 에서 실행됨 (제공)
     *
     * <p>이 메서드는 이미 구현되어 있습니다.
     *    학생은 connect() 안에서 이 메서드를 호출하는 Daemon Thread 를 시작하기만 하면 됩니다.
     * </p>
     */
    private void readLoop() {
        try {
            String line;
            while (in != null && (line = in.readLine()) != null) {
                messageListener.accept(line);
            }
        } catch (IOException e) {
            if (running) {
                messageListener.accept("[시스템] 서버와의 연결이 종료되었습니다: " + e.getMessage());
            }
        } finally {
            disconnect();
        }
    }

    /** 접속 종료 */
    public void disconnect() {
        running = false;
        // TODO: socket → in → out 순서로 close (각각 null 체크 + try-catch 로 IOException 무시)
        //       ★ socket 을 먼저 닫아야 reader 스레드의 blocking read 가 깨어나 BufferedReader lock 이 풀림
        //       (Java 21 부터 BufferedReader 는 ReentrantLock 으로 보호 → 순서 잘못되면 EDT deadlock)
    }

    public boolean isConnected() {
        return socket != null && !socket.isClosed();
    }
}
