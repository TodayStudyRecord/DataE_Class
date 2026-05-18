package Ch03;

class 캬라멜  {

	@Override
	public String toString() {
		return "캬라멜";
	}
	
}

class 버터옥수수{

	@Override
	public String toString() {
		return "옥수수맛";
	}
	
}

class PopCorn<T>{
	T 재료;
	PopCorn(T 재료){
		this.재료 = 재료;
		
	}
	@Override
	public String toString() {
		return "PopCorn [재료=" + 재료 + "]";
	}

	
}


public class C02Ex {

	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);

		
		//출력결과
		//PopCorn [재료=캬라멜맛]
		//PopCorn [재료 = 옥수수맛]
	}

}
