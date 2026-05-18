package Ch01;

//학생이 서점주인에게 책 1권을 구매한다
//클래스 	: 학생
//속성 	: 보유금액 
//		: 책개수
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//
//클래스 	: 서점주인
//속성	: 보유금액
//		: 책개수
//		: 책가격
//기능	: 판매하기(구매자의 돈) : 책개수

//
//클래스 	: 학생(Student)
//속성 	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//		: buy(BookSeller seller , int money) : void
//
//
//클래스 	: 서점주인(BookSeller)
//속성	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//		: 책가격(price : int)
//
//기능	: 판매하기(구매자의 돈) : 책개수
//		  sell(int money) : int

class Student{
	int myMoney;
	int bookCnt;
	
	//생성자
	public Student(int myMoney, int bookCnt) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
	}

	
	// 기능 : 판매자에게 구매의사금액 전달 
	public void buy(BookSeller seller , int money) {
		int receivedbookCnt = seller.sell(money);
		myMoney -= money;
		this.bookCnt+= receivedbookCnt;
	}
	
	// ================================
	//toString
	@Override
	public String toString() {
		return "Student [myMoney=" + myMoney + ", bookCnt=" + bookCnt + "]";
	}
	
	
	
	
}
//생성자
class BookSeller{
	int myMoney;
	int bookCnt;
	int price;
	
	
	//기능
	public int sell(int money) {
		
		this.myMoney+=money;
		int calbookCnt = money/price;
		bookCnt-=calbookCnt;
		return calbookCnt;
	}
	
	
	// 채우기
	
	public BookSeller(int myMoney, int bookCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "BookSeller [myMoney=" + myMoney + ", bookCnt=" + bookCnt + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}

 class C13EX {

	public static void main(String[] args) {
		//고객
		Student 학생 = new Student(100000,0);
		
		//서점주인
		BookSeller 서점주인 = new BookSeller(100000,30,10000);
		
		// 구매 요청
		학생.buy(서점주인, 50000);
		
		System.out.println(학생);
		System.out.println(서점주인);
		
		
	}

}