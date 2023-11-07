package override;

public class Ex1 {

	public static void main(String[] args) {
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000);
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer("또치");
		vip.calcPrice(10000);
		vip.showInfo();

	}

}
class Customer{
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "등급이며, 보너스 포인트는 " + bonusPoint + "점 입니다.");
		
	}
	
	
}
class VIPCustomer extends Customer {
	double saleRatio;
	
	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {

		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName + "님이" + salePrice + "원을 결제했습니다.");
	}
	
}