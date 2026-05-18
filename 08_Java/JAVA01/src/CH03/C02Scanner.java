package CH03;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수 입력 : ");
		int num1 = sc.nextInt(); 
		System.out.println("입력된 실수 값 : " + num1);
		
		System.out.printf("실수 입력 : ");
		double num2 = sc.nextDouble(); 
	
		System.out.println("입력된 실수 값 : " + num2);
		
		System.out.print("문자열 입력 :");
//		String str1 = sc.next();			//문자열 입력 받기 함수, 띄어쓰기는 포함 X
//		System.out.println("입력된 문자열 : " + str1);
		
		String str1 = sc.nextLine();			//문자열 입력 받기 함수, 띄어쓰기는 포함 X
		System.out.println("입력된 문자열 : " + str1);
		
		sc.close();

	}

}
