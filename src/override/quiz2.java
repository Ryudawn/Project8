package override;

public class quiz2 {

	public static void main(String[] args) {
		Coffe coffe1 = new Coffe();
		coffe1.taste();
		Coffe coffe2 = new Americano();
		coffe2.taste();
		Coffe coffe3 = new  CafeLatte();
		coffe3.taste();
		
	}

}
class Coffe{
	public void taste() {
		System.out.println("커피를 마신다.");
	}
}
class Americano extends Coffe{
	public void taste() {
		System.out.println("아메리카노를 마신다.");
	}
}
class CafeLatte extends Coffe{
	public void taste() {
		System.out.println("라떼를 마신다.");
	}
}