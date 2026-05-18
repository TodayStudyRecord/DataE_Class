package Ch10;

public class C03Worker2 implements Runnable {

	C03GUI gui2;

	public C03Worker2(C03GUI c03gui) {
		this.gui2 = c03gui;
	}

	@Override
	public void run() {

			try {

				for (int i1 = 0;; i1++) {
					System.out.println("TASK02..." + i1);
					gui2.area2.append("Task02..." + i1 + "\n");
					Thread.sleep(500);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("[EXCEPTION] WORKER02 THREAD INTERRUPTED..");
			}

		}
	}