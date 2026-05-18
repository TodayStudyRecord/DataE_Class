package Ch01;

import java.util.Scanner;

public class C16test {

	public static void main(String[] args) {
		
		
		//1번 문제 별찍기 피라미드 
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i=0;
//		
//		while(i<h) {	
//			
//			int j=0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			int k=0;
//			
//			while(k<=i*2) {
//				System.out.print("*");  
//				k++;
//			}		
//			
//			System.out.println();
//			i++;
//		}
//		sc.close();	
// ----------------------------------------------------
		// 2번 문제 다이아몬드 별찍기
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
		
		
		
	}

}


