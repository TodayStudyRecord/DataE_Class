package Ch01;


//손님이 카페사장에게 커피 1잔을 주문한다
//클래스 	: 손님
//속성 	: 보유금액
//		: 커피잔수
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//
//클래스 	: 카페사장
//속성	: 보유금액
//		: 커피재고
//		: 커피가격
//기능	: 제조하기(손님의 돈) : 커피잔수


//손님이 카페사장에게 커피 1잔을 주문한다
//
//클래스 	: 손님(Customer)
//속성 	: 보유금액(myMoney : int)
//		: 커피잔수(coffeeCnt : int)
//
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//		: order(CafeOwner owner , int money) : void
//
//
//클래스 	: 카페사장(CafeOwner)
//속성	: 보유금액(myMoney : int)
//		: 커피재고(coffeeCnt : int)
//		: 커피가격(price : int)
//
//기능	: 제조하기(손님의 돈) : 커피잔수
//		  make(int money) : int

class Customer{
	int myMoney;
	int coffeeCnt;
	
	// 생성자
	public Customer(int myMoney, int coffeeCnt) {
		super();
		this.myMoney = myMoney;
		this.coffeeCnt = coffeeCnt;
	}
	
	// 기능 추가하기
	public void order(CafeOwner owner, int money) {
		int receivedcoffeeCnt = owner.make(money);
		myMoney -= money;
		this.coffeeCnt += receivedcoffeeCnt;
	}

	
	
	//to string
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", coffeeCnt=" + coffeeCnt + "]";
	}

	
	
}


class CafeOwner{
	int myMoney;
	int coffeeCnt;
	int price;
	

	
	public int make(int money){
		this.myMoney+=money;
		int calcoffeeCnt = money/price;
		coffeeCnt -= calcoffeeCnt;
		return calcoffeeCnt;
	}
	
	
	public CafeOwner(int myMoney, int coffeeCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.coffeeCnt = coffeeCnt;
		this.price = price;
	}


	@Override
	public String toString() {
		return "CafeOwner [myMoney=" + myMoney + ", coffeeCnt=" + coffeeCnt + ", price=" + price + "]";
	}
	
}

public class C14EX {

	public static void main(String[] args) {
		
		Customer 손님 = new Customer(100000,0);
		
		CafeOwner 카페사장 = new CafeOwner(100000, 100, 5000);
		
		손님.order(카페사장, 50000);
		
		System.out.println(손님);
		System.out.println(카페사장);
		
		
		
		
		
		
	}

}