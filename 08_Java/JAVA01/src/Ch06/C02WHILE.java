package Ch06;

import java.util.Scanner;

public class C02WHILE {
	
	public static void main(String[] args) {
		
		// 2 - 9 단 출력
		
//		dan		i
//		2		1
//				2
//				..
//				9
//		--------------------
//		dan=2		i=1
//		dan++		i++
//		dan<10		i<10
		
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
		
		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int dan = n;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = n;
//		while(dan<(m+1)) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		

		// N - M 단 출력 거꾸로 9 x 9 , 9 x 8 ....
	
//		dan		i
//		n , m(n<m)
//		m		9
//				8
//				..
//				1
//		m-1		1
//				2
//				..
//				9
//
//		n		9
//				8
//				..
//				1
//		--------------------
//		dan=m		i=9
//		dan--		i--
//		dan>n-1		i>0
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = m;
//		while(dan>n-1) {
//			
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			
//			System.out.println();
//			dan--;
//		}
//		sc.close();
		
		
		// 1) 고정높이 
		// *****
		// *****
		// *****
		// *****
		
//		i(행)	j(별)
//		0		0-4
//		1		0-4
//		2		0-4
//		3		0-4
//		---------------
//		i=0		j=0
//		i++		j++
//		i<4		j<5
		
//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		// 2)
		// 높이 : 4 
		// *****
		// *****
		// *****
		// *****
//		높이 : h
//
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
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		------------------
//		i=0		j=0
//		i++		j++
//		i<4		j<=i
		
//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
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
		
		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		

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
//		int i=0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<=(h-1)-i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******

// 고정높이(h : 4)
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		-------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<3-i		k<=i*2

//		int i=0;
//		while(i<4) {
//			
//			//공백
//			int j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=i*2) {
//				System.out.print("*");           <<<<<<<<<<<<<<<<<<<<<<<<여기
//				k++;
//			}
//			System.out.println();
//			i++;
//			
		// ?????????????????????????????????????
		// 높이  : h		, ~는 범위
		//		i(행)		j(공백)				k(별)
		//		0			0~(h-2)				0-0
		//		1			0~(h-2)-1			0-2
		//		2			0~(h-2)-2			0-4
		//		3			x					0-6
		//      ..			..					..
		//		h-1			0~(h-2)-(h-1)
		//		-------------------------------------
		//		i=0			j=0			k=0
		//		i++			j++			k++
		//		i<h			j<(h-2)-i	k<=i*2
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {	
//			
//			int j=0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			int k=0;
//			while(k<=i*2) {
//				System.out.print("*");  
//				k++;
//			}		
//			System.out.println();
//			i++;
//		}
//		sc.close();					//<<<<<<<<<<<<<<<<<<<<<<<<<<
	
		
		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *
		
		
		
		//=================================================
		// 높이  : 4	
		//		i(행)		j(공백)		k(별)
		//		0			x			0-6
		//		1			0~0			0-4
		//		2			0~1			0-2
		//		3			0~2			0-0
		//		-------------------------------------
		//		i=0			j=0			k=0
		//		i++			j++			k++
		//		i<4			j<=i-1		k<7-(i*2)	or k<=6-2*i	
		//==============================================
		
		
		
//		int i=0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<=i-1){
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<7-(i*2)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//=================================================
		// 높이  : h	
		//		i(행)		j(공백)		k(별)
		//		0			x			0-6
		//		1			0~0			0-4
		//		2			0~1			0-2
		//		3			0~2			0-0
		//		..
		//		h-1			h+1
		//		-------------------------------------
		//		i=0			j=0			k=0
		//		i++			j++			k++
		//		i<h			j<=i-1		k<=((h-1)*2)-2*i
		
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {	
//			//공백
//			int j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			int k=0;
//			while(k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}		
//			System.out.println();
//			i++;
//		}
//		sc.close();		
		
		
		
		
		
		//===========================================
		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		// 고정 높이
		//		i(행)		j(공백)		k(별)
		//		0			0~2			0~0
		//		1			0~1			0~2
		//		2			0~0			0~4
		//		3			x			0~6
		//------------------------------------
		//		i<4			j=0			k=0
		//					j++			k++
		//					j<3-i		k<2*i
		//------------------------------------
		//		4			0~0			0~4
		//		5			0~1			0~2
		//		6			0~2			0~0
		//-------------------------------------
		//		i=0			j=0			k=0
		//					j++			k++
		//					j<=i-4			k<(6*2)-i*2
		
//		int i=0;
//		while(i<7) {
//			
//			if(i<4) {
//				
//				//공백
//				int j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}else {
//		
//				//공백
//				int j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=(6*2)-i*2) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}
//			
//			
//			System.out.println();
//			i++;
//			
//		}
		
		
		
		
		
		
		//==========================================
		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		//============================================
		// 높이
		//		i(행)		j(공백)		k(별)
		//		0			0~2			0~0
		//		1			0~1			0~2
		//		2			0~0			0~4
		//		3			x			0~6
		//------------------------------------
		//		i<=h/2		j=0			k=0
		//					j++			k++
		//					j<(h/2)-i	k<2*i
		//------------------------------------
		//		4			0~0			0~4
		//		5			0~1			0~2
		//		6			0~2			0~0
		//-------------------------------------
		//					j=0			k=0
		//					j++			k++
		//					j<=i-h/2+1	k<((h-1)*2)-i*2		
		
		//===========================================
		Scanner sc = new Scanner(System.in);   
	      int h =sc.nextInt();
	      int i = 0;
	      while(h%2==0 || h<=1) {
	         System.out.println("재입력(홀수) : ");
	         h=sc.nextInt();
	      }
	      while(i<h) {
	         int j =0;
	         int k =0;
	         if(i<h/2+1) {
	            while(j<h/2-i) {
	               System.out.print(" ");
	               j++;
	            }
	            while(k<=2*i) {
	               System.out.print("*");
	               k++;               
	            }
	         }
	         else {
	            while(j<i-h/2) {
	               System.out.print(" ");
	               j++;
	            }
	            while(k<=2*(h-i-1)) {
	               System.out.print("*");
	               k++;               
	            }            
	         }
	         System.out.println();
	         i++;
	      }
	      sc.close();           				
//		
		
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		}
	
}