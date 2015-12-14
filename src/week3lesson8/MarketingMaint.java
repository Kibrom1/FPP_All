package week3lesson8;

import java.util.ArrayList;
import java.util.Comparator;

class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;

	public Marketing(String employeeName, String productName, double salesAmount) {
		// TODO Auto-generated constructor stub
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public String toString() {

		return "Name: " + employeeName + " Product Name: " + productName + " Sales Amount: " + salesAmount;
	}
}

public class MarketingMaint {

	public static final Comparator EMPLOYEENAME = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub

			String marketing1 = ((Marketing) o1).getEmployeeName();
			String marketing2 = ((Marketing) o2).getEmployeeName();
			return marketing1.compareTo(marketing2);
		}
	};

	public static final Comparator SALESAMOUNT = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub

			Double sales1 = (Double) ((Marketing) o1).getSalesAmount();
			Double sales2 = (Double) ((Marketing) o2).getSalesAmount();
			return sales1.compareTo(sales2);
		}

	};

	public static void main(String[] args) {
		ArrayList<Marketing> marketingList = new ArrayList<>();
		marketingList.add(new Marketing("Joshu", "steal", 200.90));// adding
		marketingList.add(new Marketing("aelen", "steal", 200.90));// adding
		marketingList.add(new Marketing("Selam", "auto", 2387));// adding

		Marketing mrk = marketingList.get(1);
		System.out.println(mrk.getEmployeeName());
		marketingList.remove(1);// removing
		marketingList.set(1, new Marketing("Gebre", "Computer", 348));// setting

		Marketing mrks = marketingList.get(1);
		System.out.println(marketingList.size());

		System.out.println(mrks.getEmployeeName());

		System.out.println(mrk.getEmployeeName());

		marketingList.sort(EMPLOYEENAME);

		System.out.println(marketingList.get(1).getEmployeeName());
		System.out.println(marketingList);
		System.out.println("Size: " + marketingList.size());

	}

}

//Output
/*
 
 aelen
2
Gebre
aelen
Joshu
[Name: Gebre Product Name: Computer Sales Amount: 348.0, Name: Joshu Product Name: steal Sales Amount: 200.9]
Size: 2

 
 */
