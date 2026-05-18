package Ch01;

import java.util.Objects;

class C03Simple
{
	int n;
	//모든 인자 생성자
	C03Simple(int n){this.n = n;}
	
	
	@Override
	public boolean equals(Object obj) 	//ob1.equals(ob2)
										//Object obj = ob2
	
	{
		if(obj instanceof C03Simple) {
			
			C03Simple down =(C03Simple)obj;
			return down.n == this.n;
		}
		return false;
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(this.n);
	}
	
	//
	
	
	
}

public class C03ObjectMain {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		C03Simple ob2 = new C03Simple(20);
		C03Simple ob3 = new C03Simple(10);
		System.out.println(ob1);
		System.out.printf("%x\n", ob1.hashCode());
		System.out.printf("%x\n", ob2.hashCode());
		System.out.printf("%x\n", ob3.hashCode());
	}

}
