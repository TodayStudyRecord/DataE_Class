package Ch16;

//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스를 정의
interface Calculator{
	int calculate(int num1, int num2);
}

public class C03Ex {

	public static void main(String[] args) {
		
		Calculator add = (a,b)->{return a+b;};
		Calculator sub = (a,b)->{return (a>b)?a-b:b-a;};
		Calculator mul = (a,b)->{return a*b;};
		Calculator div = (a,b)->{return a/b;};
		
		
		
		//결과
		System.out.println(add.calculate(10,20)); // 덧셈
		System.out.println(sub.calculate(30,10)); // 뺄셈
		System.out.println(mul.calculate(10,20)); // 곱셈
		System.out.println(div.calculate(100,5)); // 나눗셈
		//출력 결과
//		30
//		20
//		200
//		20
		
	}

}
