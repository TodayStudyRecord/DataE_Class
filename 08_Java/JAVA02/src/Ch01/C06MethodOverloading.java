package Ch01;

import java.util.Scanner;

class Cal{
	//속성
	Scanner sc = new Scanner(System.in);
	
	//기능
	public int sum(int n1, int n2) {
		System.out.println("int sum(int n1, int n2) CALL");
		return n1 + n2;
	}
	public int sum() {
		System.err.println("int sum() CALL");
		return sc.nextInt() + sc.nextInt();
	}
	public int sum(int n1, int n2, int n3) {
		System.out.println("sum2(int n1, int n2, int n3)");
		return n1 + n2 + n3;
	}
	public int sum(int n1, int n2, int n3, int n4) {
		System.out.println("sum3(int n1, int n2, int n3, int n4)");
		return n1 + n2 + n3 + n4;
	}
	
}

public class C06MethodOverloading {

	public static void main(String[] args) {
		Cal cal = new Cal();
		System.out.println("SUM1 : " +  cal.sum(10,20) );
		System.out.println("SUM2 : "); System.out.println( cal.sum() ) ;
		System.out.println("SUM3 : " + cal.sum(10, 20, 30) );
		System.out.println("SUM4 : " + cal.sum(10,20,30,40) );
	}

}
