package Ch04;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
class ArrayUtils {
	   public static int[] concat(int[] a, int[] b) {
	        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
		   int desc [] = new int [a.length + b.length];
		   for(int i=0;i<a.length;i++) {
			   desc[i] = a[i];
		   }
		   for(int j=0;j<b.length;j++) {
			   desc[j+a.length] = b[j];
		   }
		   return desc;

	   }  
	   public static void print(int [] a) {
		   /* 
		    * 배열내 모든 요소 1행으로 띄어쓰기 단위로 출력
		    * ex. a [] = {10,20,30,40}
		    * 출력 : 10 20 30 40
		    *  */	
		   Arrays.stream(a).forEach((el)->{System.out.println(el);}); 
	   }
}

public class C04Ex {
	public static void main(String[] args) {
		
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtils.concat(array1, array2);
		ArrayUtils.print(array3);
	}
}