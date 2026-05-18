package Ch01;

class C02Simple
{
	int n;
	//모든 인자 생성자
	C02Simple(int n){this.n = n;}
	
	
	@Override
	public boolean equals(Object obj) 	//ob1.equals(ob2)
										//Object obj = ob2
	
	{
		if(obj instanceof C02Simple) {
			
			C02Simple down =(C02Simple)obj;
			return down.n == this.n;
		}
		return false;
	}
	
	//
	
}

public class C02ObjectMain {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(20);
		C02Simple ob3 = new C02Simple(10);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
	}

}
