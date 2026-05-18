package Ch04;

class C02Simple
{
	static int n1;
	int n2;
	
	void func1() {
		n1=100;
		n2=200;
	}
		
	static void func2() {
		n1=300;
		n2=400; // static 함수에서 사용되는 변수는 static 변수 or 지역 변수만 사용가능(일반 멤버 x )
	}

}


public class C02StaticMain {

	public static void main(String[] args) {
		

	}

}
