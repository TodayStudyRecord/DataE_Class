package Ch05;

// 함수 재정의(Method Overriding)
// : 상속 관계를 전제로 상위 클래스의 메서드를 
//  하위 클래스가 재정의(함수의 Body를 고쳐 사용)하는 것을 허용한 문법
// :메서드의 헤더부분은 동일하고 본문({})의 로직을 수정할 수 있게 허용함으로서 
//  다양한 형태의 객체가 형성 될 수 있도록 유도(다형성의 근거가 될 수 잇는 문법 중 하나)
// : 상위 클래스로 부터 동일한 메서드를 물려받더라도 
//   각 하위 클래스마다 다른 기능 구현의 결과물을 만들어 낼수 잇음

// 오버로딩 vs 오버라이딩

// 오버로딩 
// 1) 상속 전제 ? x
// 2) 함수의 헤더 변경 ? o 반환자료형 고려사항 아님, 함수명 고정, 파라미터 변동
// 3) 함수 본문 변경 ? x
// 4) 목적 ? 개발 편의성에 중점(함수의 이름은 고정)

// 오버라이딩
//1) 상속 전제 ? o => 상속 관계가 있어야함
//2) 함수의 헤더 변경 ? x => 물려받은 그대로 사용함
//3) 함수 본문 변경 ? o 
//4) 목적 ? 다형성을 목표, 다양하게 실행결과를 다룰 수 있음


class Animal{
	void sound() {System.out.println("소리낸다!");}
}

class Dog extends Animal{
	void sound() {System.out.println("멍멍 소리낸다!");};
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("야옹 소리낸다!!");
	}
	
}






public class C03MethodOverriding {

	public static void main(String[] args) {
		
		Dog tori = new Dog();
		tori.sound();
		System.out.println("----------------");
		Cat navi = new Cat();
		navi.sound();

	}

}
