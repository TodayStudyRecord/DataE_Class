package Ch16;


interface Printer{
	void print(String name); 	// 추상메서드
//	String print(String name);
}



public class C02Lamda {

	public static void main(String[] args) {
		
		// 01
//		Printer printer = (name)->{System.out.println("01 " + name);};
//		Printer printer = System.out::println;
//		printer.print("HELLO WORLD");
		
		//02
//		Printer printer = (name)->{return "02 " + name;};
//		String str2 = printer.print("HELLO WORLD");
//		System.out.println(str2);
		
	}

}
