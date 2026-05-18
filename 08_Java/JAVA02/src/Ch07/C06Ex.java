package Ch07;

interface Printer{
	void print();
}

public class C06Ex {

	public static void main(String[] args) {

	       Printer p = new Inkjet();
	       p.print();	// 'Inkjet 프린터 출력' 
	       p = new Laser();
	       p.print();	// 'Laser 프린터 출력'

	}

}
