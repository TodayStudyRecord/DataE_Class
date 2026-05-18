package Ch16;

// 박스를 열어 안의 값 꺼내기 (읽기 전용 클로저)
interface ClosureBox {
	String open();
}

// 인자X / 반환 X - 단순 실행 작업 (필드 트릭 데모용)
interface Task {
	void run();
}


class Simple{
	int n;

	@Override
	public String toString() {
		return "Simple [n=" + n + "]";
	}
	
}

// 호출 할 때 마다 자기 안의 숫자를 1 증가시켜 반환 (가변 클로저)
interface TickBox {
	int tick();
}



public class C06ClosureBasic {

	public static int n;
	
	//박스 공장 1 : item 박제해서 박스 반환(읽기 전용)
	private static ClosureBox makeBox(String item) {
		return () -> "박스 안 : " + item;
	}
	
	// 박스 공장 2 : start 부터 카운트하는 박스 반환 (가변)
	private static TickBox makeTicker(int start) {
		int[] n = { start };			// 람다가 캡쳐해서 들고 다닐 "주머니"
		return () -> n[0]++;		// 현재값 반환 후 +1
 	}
	
	public static void main(String[] args) {
		
		// 1 읽기 전용 확인
//		ClosureBox box1 = makeBox("사과");
//		ClosureBox box2 = makeBox("바나나");
//		ClosureBox box3 = makeBox("포도");
//
//		System.out.println("(1) box.open() = " + box1.open()); 		//박스 안 : 사과
//		System.out.println("(1) box.open() = " + box2.open()); 		//박스 안 : 바나나
//		System.out.println("(1) box.open() = " + box3.open()); 		//박스 안 : 포도
		
		// 2 배열 트릭 사용
//		int n = 0;
//		Task addOne = ()->{n++;}; // 람다 내부에 외부변수 사용시 final

		
		int n [] = {0};
		Task addOne = ()->{n[0]++;}; // 람다 내부에 외부변수 사용시 final
		addOne.run();addOne.run();addOne.run();addOne.run();
		System.out.println("n[0] : " + n[0]);
		
		// 3 인스턴스 변수 / static 변수 사용
		Simple ob = new Simple();
		Task addOne2 = ()->{ob.n++;};
		addOne2.run();addOne2.run();addOne2.run();addOne2.run();addOne2.run();
		System.out.println(ob);
		
		Task addOne3 = ()->{C06ClosureBasic.n++;};
		addOne3.run();addOne3.run();addOne3.run();addOne3.run();addOne3.run();
		System.out.println(C06ClosureBasic.n);
		
		// 4 가변 클로저(인터페이스 + 람다 마다 고유 개별 공간)
		TickBox ticker1 = makeTicker(10);
		System.out.println(ticker1.tick());
		System.out.println(ticker1.tick());
		System.out.println(ticker1.tick());
		System.out.println(ticker1.tick());
		System.out.println(ticker1.tick());
		
		TickBox ticker2 = makeTicker(100);
		System.out.println(ticker2.tick());
		System.out.println(ticker2.tick());
		System.out.println(ticker2.tick());
		System.out.println(ticker2.tick());
		System.out.println(ticker2.tick());
	
	}

}
