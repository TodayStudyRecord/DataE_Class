package CH03;

import java.util.Scanner;

// 자동 importctrl + shift + o

public class C01Scanner {

	public static void main(String[] args) {
		
		
		// 스트림 
		// System.in	: 표준 입력 스트림 요청 
		// System.out	: 표준 출력 스트림 요청
		
		// stream : 시냇물 (단방향성)
		// 데이터의 논리적 이동채널(통로)
		
		// new Scanner(System.in) : 표준 입력 스트림을 연결한 Scanner 객체
		// Scanner sc = new Scanner(System.in)
		// 표준 입력 스트림에 연결된 Scanner 객체를 생성한 다음(생성 위치 : HEAP)
		// 해당 객체의 위치값(메모리 주소)를 MainStack 영역의 Scanner sc 참조 변수에 초기화
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("num1 입력 : ");
		int num1 = sc.nextInt(); // 엔터(\n), 스페이스바
	
//		System.out.printf("num2 입력 : ");
		int num2 = sc.nextInt(); // 엔터(\n), 스페이스바

//		System.out.printf("num3 입력 : ");
		int num3 = sc.nextInt(); // 엔터(\n), 스페이스바
		
		System.out.printf("%d %d %d\n", num1, num2, num3);
		sc.close();
	}

}
