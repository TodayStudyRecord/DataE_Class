package Ch02;

import java.util.Scanner;


public class C03Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("나눗셈을 위한 두 값을 입력하세요 : ");
	
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	
		System.out.println("나눗셈 결과 " + n1/n2); // N/0시 예외 발생!
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}

}