package CH02;

public class C03TypeChange {

	public static void main(String[] args) {
		// byte > short, char > int > long > float > double
		
		int num1 = 129; // 00000000 00000000 00000000 10000001
		int num2 = 130;	// 00000000 00000000 00000000 10000001
		
		byte ch1 = (byte)num1; //1000001 -> 음수
		byte ch2 = (byte)num2; //1000010 -> 음수
		
		System.out.printf("%d\n", ch1);
		System.out.printf("%d\n", ch2);
		

	}

}
