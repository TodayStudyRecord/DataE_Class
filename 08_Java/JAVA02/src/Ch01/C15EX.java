//package Ch01;
//
////관객이 매표원에게 영화표 1장을 예매한다
////클래스 	: 관객
////속성 	: 보유금액
////		: 티켓개수
////기능 	: 예매하기(매표원, 보유금액의 일부)
////
////클래스 	: 매표원
////속성	: 보유금액
////		: 티켓재고
////		: 티켓가격
////기능	: 발권하기(관객의 돈) : 티켓개수
//
//
////관객이 매표원에게 영화표 1장을 예매한다
////
////클래스 	: 관객(Audience)
////속성 	: 보유금액(myMoney : int)
////		: 티켓개수(ticketCnt : int)
////
////기능 	: 예매하기(매표원, 보유금액의 일부)
////		: reserve(TicketSeller seller , int money) : void
////
////
////클래스 	: 매표원(TicketSeller)
////속성	: 보유금액(myMoney : int)
////		: 티켓재고(ticketCnt : int)
////		: 티켓가격(price : int)
////
////기능	: 발권하기(관객의 돈) : 티켓개수
////		  issue(int money) : int
//
//class Audience{
//	int myMoney;
//	int ticketCnt;
//	
//	
//	public Audience(int myMoney, int ticketCnt) {
//		super();
//		this.myMoney = myMoney;
//		this.ticketCnt = ticketCnt;
//	}
//	
//	public void reserve(TicketSeller seller, int money) {
//		int recivedtiketCnt = TicketSeller.reserve(money);
//		myMoney -= money;
//		this.ticketCnt += recivedtiketCnt;
//	}
//
//	
//	// 오버라이드
//	@Override
//	public String toString() {
//		return "Audience [myMoney=" + myMoney + ", ticketCnt=" + ticketCnt + "]";
//	}
//
//	public void issue(TicketSeller 매표원, int i) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//class TicketSeller{
//	int myMoney;
//	int ticketCnt;
//	int price;
//	
//	public TicketSeller(int myMoney, int ticketCnt, int price) {
//		super();
//		this.myMoney = myMoney;
//		this.ticketCnt = ticketCnt;
//		this.price = price;
//	}
//	
//	public int issue(int money) {
//		this.myMoney+=money;
//		int calticketCnt = ticketCnt;
//		ticketCnt -=calticketCnt;
//		return calticketCnt;
//	}
//	
//	
//	
//
//	@Override
//	public String toString() {
//		return "TicketSeller [myMoney=" + myMoney + ", ticketCnt=" + ticketCnt + ", price=" + price + "]";
//	}
//	
//	
//	
//	
//	
//}
//	 
//
//
//public class C15EX {
//
//	public static void main(String[] args) {
//		Audience 관객 = new Audience(100000,0);
//		
//		TicketSeller 매표원 = new TicketSeller(100000, 3000, 10000);
//		
//		관객.issue(매표원, 50000);
//		
//		System.out.println(관객);
//		System.out.println(매표원);
//
//	}
//
//}