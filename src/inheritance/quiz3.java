package inheritance;

public class quiz3 {
	public static void main(String[] args) {
		
		Ball ball = new Ball() ;
		ball.bold = 2;
		ball.per = 100;
		ball.color = "파랑색";
		ball.showInfo();
		
		System.out.println();
		
		Fountain fountain = new Fountain();
		fountain.bold = 3;
		fountain.per = 80;
		fountain.brand = "몽블랑";
		fountain.showInfo();
		
	}
}
class Pen {
	int bold;
	double per;
}
class Ball extends Pen{
	String color;
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + bold);
		System.out.println("남은 양 : " + per + "%");
		System.out.println("볼펜의 색 : " + color);
	}
}
class Fountain extends Pen {
	String brand;
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + bold);
		System.out.println("남은 양 : " + per + "%");
		System.out.println("브랜드 : " +brand);
		
	}
}
