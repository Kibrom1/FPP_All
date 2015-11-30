package week1lesson3;
//billing system
public class Billing {
	

	public double computeBill(double price) {
		
		return price + (price * 8)/100;
	}

	public double computeBill(double price, int quantity) {

		return price *quantity + (price *quantity * 8)/100;
	}

	public double computeBill(double price, int quantity, double coupon) {
		
		double totalPrice = price * quantity;
		double subPrice = totalPrice - ((totalPrice * coupon)/100);
		
		return subPrice + (subPrice*8)/100;
	}
	
	public static void main(String[] args){
		
		Billing bill = new Billing();
		System.out.println("Compute Billing with one parameter:" + bill.computeBill(100));
		System.out.println("Compute Billing with two parameter:" + bill.computeBill(100,20));
		System.out.println("Compute Billing with three parameter:" + bill.computeBill(100,20,6));
	}

}
