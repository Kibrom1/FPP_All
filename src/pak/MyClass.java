package pak;

import java.util.Date;

public class MyClass {
	Date d1 = new Date(5L);
	Date d2 = new Date(33L);

	void modify() {
		d1 = d2;
	}

	public static void main(String[] args) {
		new MyClass();
	}

	MyClass() {
		modify();
		System.out.println("d1: " + d1.getTime());
		System.out.println("d2: " + d2.getTime());
	}

}
