package inheritance;

public class quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.name = "고양이";
		tiger.leg = 4;
		tiger.tail = 1;
		tiger.showInfo();
		
		System.out.println();
		
		Eagle eagle = new Eagle();
		eagle.name = "비둘기";
		eagle.leg = 2;
		eagle.wings = 2;
		eagle.showInfo();
	}

}
class Animal {
	String name;
	int leg;
}
class Tiger extends Animal{
	int tail;
	
	public void showInfo() {
		System.out.println(name + "의 다리는" + leg +"개 이고, 꼬리는 " +tail + "개 이다.");
	}
}
class Eagle extends Animal{
	int wings;
	
	public void showInfo() {
		System.out.println(name + "의 다리는" + leg +"개 이고, 날개는 " + wings + "개 이다.");
	}
}