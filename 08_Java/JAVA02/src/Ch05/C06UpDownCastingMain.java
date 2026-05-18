package Ch05;


class Super{
	int n1;
}

class Sub extends Super{
	int n2;
}


public class C06UpDownCastingMain {

	public static void main(String[] args) {
		//casting : 형변환
		
		//NoCasting : 형변환 x
		Super ob1 = new Super();
		ob1.n1 = 10;
		
		Sub ob2 = new Sub();
		
		ob2.n1 = 10;
		ob2.n2 = 10;
		
		
		//Upcasting(매우 중요) : 상위 클래스형 참조 변수 = 하위 클래스형 객체
		//					: 자동형변환(메모리 영역의 침범우려 우려가 없기 때문에)
		//        			: 1) !상속관계로 구성된 모든 하위 객체를 연결 할 수 있다
		//                  : 2) !Upcasting 된 상태에서는 재정의 된 메서드에 접근 가능하다
		
		
		Super ob3 = new Sub(); // UPCASTING
		ob3.n1=10;
		// ob3.n2=20; => x, 접근 불가능 
		
		Super ob4 = ob2; // UPCASTING
		ob4.n1=100;
//		ob4.n2=200;
		
		// Downcasting(매우 중요) : 하위 클래스형 참조변수  = 상위클래스형 객체 
		// 					   : 강제형 변환
		// 					   : Upcasting을 전제로 작업을 진행하는 경우가 많다 

//		 Sub ob5 = (Sub)new Super();
//		 ob5.n1 = 100;
//		 ob5.n2 = 200;
		
		Sub down = (Sub)ob4; 		// 
		down.n1=100;
		down.n2=200;
	}

}
