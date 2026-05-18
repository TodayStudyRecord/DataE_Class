package Ch04;

class Company
{
	int n1;
	int n2;
	//싱글톤 패턴 코드 (객체 생성을 제한 )
	private static Company instance;
	private Company() {} // 메인포인트? -> 객체는 내부에서만 생성가능
	public static Company getInstance() {
		if(instance==null)
			instance = new Company();
		return instance;
	}
	//toString 재정의
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}


public class C03SingleTonMain {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();

		com1.n1=100;
		com2.n2=200;
		System.out.println("com1 : " + com1);
		System.out.println("com2 : " + com2);
	}

}
