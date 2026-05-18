package CH02;

public class C06TypeChange {

	public static void main(String[] args) {
		// byte > short, char > int > long > float > double
		char n1 = 60000; // n1의 비트열 : 11101010 0110000
		short n2 = (short)n1; // ?
		System.out.println(n2);
		
		int n3 = n2;
		System.out.println(n3);

	}

}
