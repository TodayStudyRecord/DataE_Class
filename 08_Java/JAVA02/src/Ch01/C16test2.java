package Ch01;

class Buyer{
	private int myMoney;
	private int appleCnt;
	
	//생성자
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	public void pay(Seller seller , int money){


		
		int receivedAppCnt = seller.sales(money);
		
		
		myMoney -= money;
		
		
		this.appleCnt+= receivedAppCnt;
	}
	
	
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}



	
}
class Seller{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	public int sales(int money){
		
		this.myMoney+=money;
		
		
		int calAppCnt = money/price;
		
		
		appleCnt-=calAppCnt;

		
		
		return calAppCnt;
	}
	
	
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
}

public class C16test2 {

	public static void main(String[] args) {
		
		
		Buyer 홍길동 = new Buyer(100000,0);
		Buyer 남길동 = new Buyer(50000,0);
		
		
		Seller 사과장수1 = new Seller(100000,100,1000);
		
		
		홍길동.pay(사과장수1, 20000);
		남길동.pay(사과장수1, 10000);
		
		
		System.out.println(홍길동);
		System.out.println(남길동);
		System.out.println(사과장수1);

	}

}