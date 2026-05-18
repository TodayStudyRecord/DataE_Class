package Ch02;

public class C02ArrayIndexBoundExceptionMain {

	public static void main(String[] args) {

		try {
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 처리!");

		} finally {
			System.out.println("예외 발생과는 무관하게 실행되는 코드!");
		}

		System.out.println("반드시 실행되어야 할 코드1");
		System.out.println("반드시 실행되어야 할 코드2");

	}

}
