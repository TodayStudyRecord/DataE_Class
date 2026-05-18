package Ch01;

public class C04변수_자료형 {

	public static void main(String[] args) {
		
		int num1;					// int로 정수의 공간을 만들기 -> num1 이름 부여 / 답 = int만큼 크기(4byte)의 공간 형성 + num1 이름부여(변수 정의)
		num1 = 10;					// num1 이라는 곳에 10을 대입 / 답 : 10이라고 하는 값(리터럴 상수)을 상수 POOL에 저장, num1 공간에 대입(복사)
		int num2 = 4;				// int로 정수의 공간을 만들기 / 답 : num2에 4라는 값(리터럴 상수) 상수POOL 저장, 4byte 정수공간 num2 초기화
		int num3 = num1 + num2;		// int로 num1 과 2를 더한 값을 num3에 대입 / 답 : num1안의 값과 num2안의 값의 덧셈 결과 (cpu 가산처리)를 4byte 정수공간 num3에 초기화
		System.out.println(num3);	// num3은 14임을 선언 / 답 : num3안의 값을 println메서드로 전달해서 내부적으로 표준출력 처리
				
		// Data(수, 자료) : 선 저장 / 후 처리
		// 변수 : 개발자의 유지보수 측면에서 유리하도록 하기 위해 지정한 수(바뀔 예정인 수)
		// 변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자 형태의 주소 
		// 자료형 : Data(수, 자료)를 저장하기 위한 공간을 형성하고 저장될 자료의 형태를 제한하는 예약어
		// =연산자 :
		// lv(공간) = rv(값) rv를 먼저 처리(저장 or 연산)한 다음 lv에 대입
		
	}

}
