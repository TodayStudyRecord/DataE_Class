package Ch16;


interface Greeter {
	String say();
}

public class C05ClosureBasic {

	//
	private static Greeter makeGreeter(String name) {
		return ()->{return "closure : " + name;};
	}
	
	
	public static void main(String[] args) {
		// 1 외부 변수 캡처
		String str = "Hello?";
		Greeter t1 = ()->{return str;};
		System.out.println("1." + t1.say());
		
		// 2 외부 변수 캡처
		int n = 100;
		Greeter t2 = ()->{return "2."+n;};	// n --> final 지정
//		n=200; 값변경 불가? -> 외부 변수를 참조하기 떄문
		System.out.println(t2.say());
		
		// 3 
		Greeter t3 = makeGreeter("hihi");
		Greeter t4 = makeGreeter("hello");
		
		System.out.println(t3.say());
		System.out.println(t4.say());
	}

}
