package Ch06;

import java.util.Scanner;

public class C00PRACTICE {

	public static void main(String[] args) {
		
		// 01 HELLOWORLD 10회 출력
		// 탈출용 변수 : i=0
		// 탈출 조건식 : i<10
		// 탈출 연산식 : i++
		
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
//		
		// 02 HELLOWORLD N회 출력(N>0)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<0) {
//			System.out.println("N은 0보다 커야합니다.");
//			System.exit(-1);
//		}
//		
//		int i=0;
//		while(i<n) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
//		sc.close();
//		
		//03 1부터 10까지 합 구하기
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1, 10, sum);
		
		
		// N부터 M까지의 합
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		int i = N;
//		int sum = 0;
//		while(i<=M) {
//			System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", N , M, sum);
//		sc.close();
				
		// 구구단 2 x 1 = 1 , 2 x 9 = 18 찍기
//		int i=1;
//		int dan = 2;
//		while(i<10) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan*1);
//			i++;
//		}
		
		// 구구단 N단 받아서 찍어보기 (N>=2 && 9<=N) OR (N<2 || N>9)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		while(N<2 || N>9) {
//			System.out.print("2이상 9이하 값 입력해야합니다. : ");
//			N = sc.nextInt();
//		}
//		
//		int i=9;
//		int dan = N;
//		while(i>0) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//			i--;
//		}
//		
//		sc.close();
		
		// 2에서 9단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//		
//			System.out.println();
//			dan++;
//			
//		}
//	
		
//		i(행)	j(별)
//		0		0
//		1		0
//		2		0
//		3		0
//		---------------
//		i=0		j=0
//		i++		j++
//		i<4		j<5		
		
		// 문제 1) 고정높이 
		// *****
		// *****
		// *****
		// *****
		
//		int i = 0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
			
			
		// 문제 2) 높이 : h
		// 높이 : 4  
		// *****
		// *****
		// *****
		// *****
			
		//		i(행)	j(별)
		//		0		0-4
		//		1		0-4
		//		2		0-4
		//		3		0-4
		//		..
		//		h-1		0-4
		//		---------------
		//		i=0		j=0	
		//		i++		j++
		//		i<h		j<5
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		// 3) 고정높이
		// * 
		// ** 
		// *** 
		// **** 
		
		//		i(행)	j(별)
		//		0		0
		//		1		0
		//		2		0
		//		3		0
		//		---------------
		//		i=0		j=0
		//		i++		j++
		//		i<4		j<=i
		
//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<=i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 4)
		// 높이 : 4 
		// * 
		// ** 
		// *** 
		// ****
		//		i(행)	j(별)
		//		0		0-0
		//		1		0-1
		//		2		0-2
		//		3		0-3
		//		..
		//		h-1		0-(h-1)
		//		------------------		
		//		i=0		j=0
		//		i++		j++
		//		i<h		j<=i
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		// --------------------------------------------------
		// 문제 5) 
		//높이 : 4
		//****
		//***
		//**
		//*	
		// -------------------------------------------------
		//		i(행)		j(별)
		//		0			0-(h-1)
		//		1			0-(h-1)-1
		//		2			0-(h-1)-2
		//		3			0-(h-1)-3
		//		..
		//		h-1			0-0
		//		---------------------		
		//		i=0			j=0
		//		i++			j++
		//		i<h			j<=(h-1)-i
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<=(h-1)-i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		//------------------------------------------------
		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******		
		//-------------------------------------------------
		//		i(행)		j(공백)		k(별)
		//		0			0-2			0-0
		//		1			0-1			0-2
		//		2			0-0			0-4
		//		3			x			0-6
		//-----------------------------------------------------
		//		i=0			j=0			k=0
		//		i++			j++ 		k++
		//		i<4			j<3-i		k<=i*2
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		while(i<4) {
			int j=0;
			while(j<3-i) {
				System.out.print(" ");
				j++;
				}
				int k=0;
				while(k<=i*2) {
					System.out.print("*");
					k++;			
				}
				System.out.println();
				i++;	
		}	
			
		sc.close();
		
		
	}

}
