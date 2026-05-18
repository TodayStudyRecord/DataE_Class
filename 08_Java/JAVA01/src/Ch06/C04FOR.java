package Ch06;

import java.util.Scanner;

public class C04FOR {

	public static void main(String[] args) {
		
		// 03 1 부터 10까지 합 구하기
		
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//		}
		
//		HELLOWORLD 10회 출력
//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//		}
		// HELLOWORLD N회 출력(N>0)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<0) {
//			System.out.println("N은 0보다 커야 합니다.");
//			System.exit(-1);
//		}
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("HELLOWORLD");
//		}
//				
//		sc.close();
		
		// 1~10까지의 합
		
		
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,10,sum);		
		

		

		// N 부터 M까지의 합(N<M)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//SWAP
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int i=n;
//		int sum = 0;
//		while(i<=m) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		int sum = 0;
//		for(int i=n;i<=m;i++) {
//			System.out.println("i : " + i);
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
//		
//		sc.close();
		
		
		
		// 2 - 9 단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}

//		int dan =2;
//		for(int i=1;  i<10; i++) {
//			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//		}
		
		
		// N - 9 단 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int dan = n;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
		int dan = n;	
		for(int i=1; i<10; i++)	{
			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
		}
		sc.close();		
		
		// ???????????????????????????????????????????????????????????????????????????
		
		
		
		
		
	}

}
