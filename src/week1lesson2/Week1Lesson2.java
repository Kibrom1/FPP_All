package week1lesson2;

import java.util.Scanner;
import java.lang.String;

public class Week1Lesson2 {
	// Converting to dollars and to different cents
	public void convert(double amount) {

		double dollar = 100;
		double quarter = 25;
		double dime = 10;
		double nickel = 5;
		double penny = 1;
		int dollars = 0, quarters = 0, nickels = 0, dimes = 0, pennies = 0;
		double remainder = 0.0;
		amount *= 100;
		if (amount != 0) {
			dollars = (int) (amount / dollar);
			remainder = amount % dollar;
		}
		if (remainder != 0) {
			quarters = (int) (remainder / quarter);
			remainder = remainder % quarter;
		}
		if (remainder != 0) {
			dimes = (int) (remainder / dime);
			remainder = remainder % dime;
		}
		if (remainder != 0) {
			nickels = (int) (remainder / nickel);
			remainder = remainder % nickel;
		}
		if (remainder != 0) {
			pennies = (int) (remainder / penny);
			remainder = remainder % penny;
		}
		System.out.println("Your amount " + amount / 100 + " consists of ");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
	}

	// Check if a given year is leap year
	public boolean isLeapYear(int year) {

		return (year % 4 == 0) ? true : false;
	}

	// Check if a number is palindrom
	public boolean isPalindrome(int panam) {

		Scanner sc = new Scanner(System.in);
		while (panam < 10000 || panam > 99999) {
			System.out.println("Please Enter a five digit number");
			panam = sc.nextInt();
		}
		int remainder = panam % 10;
		int divide = panam / 10;
		int palim = remainder;
		while (divide > 0) {
			remainder = divide % 10;
			divide = divide / 10;
			palim = palim * 10 + remainder;
		}
		if (palim == panam)
			return true;

		return false;
	}

	// Producing Username from Firstname, Last name and 3 digit random number
	public String produceUserName() {
		System.out.println("Enter First Name:");
		String firstName;
		Scanner sc = new Scanner(System.in);
		firstName = sc.nextLine();
		System.out.println("Enter last Name:");
		String lastName;
		lastName = sc.nextLine();
		int max = 999, min = 100;

		int randomNumber = (int) ((Math.random() * (max - min + 1))) + min;
		// System.out.println("Random " + randomNumber);
		return firstName.substring(0, 1) + lastName.substring(0, 5) + randomNumber;
	}

	// Remove duplicate of String array
	public void removeDups(String[] arr) {
		int newarlen = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && arr[i] != null) {
					arr[j] = " ";
				}

			}
			if (!(arr[i].equals(" ")))
				System.out.println(arr[i]);

		}

	}

	// Drawing check board
	public void drawCheckBoard(int size) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}

			}
			System.out.println();
		}
	}

	// Calculation of weight on different planets
	public int calculateWeight() {

		int weight = 0;

		System.out.println("Enter Your choice of planet.");
		System.out.println("1: Venus \t 2: Mars \t 3: Jupiter \t 4: Saturn \t 5: Uranus \t 6: Neptune ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter your mass to find your weight");
		int mass = sc.nextInt();
		switch (choice) {
		case 1:
			weight = (int) (mass * 0.78);
			break;
		case 2:
			weight = (int) (mass * 0.39);
			break;
		case 3:
			weight = (int) (mass * 2.65);
			break;
		case 4:
			weight = (int) (mass * 1.17);
			break;
		case 5:
			weight = (int) (mass * 1.05);
			break;
		case 6:
			weight = (int) (mass * 1.23);
			break;
		default:
			System.out.println("Enter Valid Planet!");
			break;
		}

		return weight;
	}

	// Calculation of result for students
	public void countResult() {

		String[][] answers = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
				{ "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
				{ "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };

		String[] keys = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
		for (int i = 0; i < 8; i++) {
			int count = 0;
			for (int j = 0; j < 10; j++) {
				if (answers[i][j] == keys[j]) {
					count++;
				}
			}
			System.out.println("Student " + i + "'s correct count is " + count);
		}
	}
	// optional assiggnment
	// Encrypting and decrypting an integer

	int encrypt() {
		System.out.println("Please Enter a four digit number to be encrypted");
		Scanner sc = new Scanner(System.in);
		int decrypt = sc.nextInt();
		int[] temp = new int[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = decrypt % 10;
			temp[i] = (temp[i] + 7) % 10;
			decrypt = decrypt / 10;
		}
		int result = 0;
		for (int i = 3; i >= 0; i--) {
			result = result * 10 + temp[i];
		}

		return result;
	}

	int decrypt() {
		System.out.println("Please Enter a four digit number to be decrypted");
		Scanner sc = new Scanner(System.in);
		int encrypt = sc.nextInt();

		int[] temp = new int[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = encrypt % 10;
			temp[i] = (temp[i] + 10) - 7;
			encrypt = encrypt / 10;
		}

		int result = 0;
		for (int i = 3; i >= 0; i--) {
			result = result * 10 + temp[i];
		}

		return result;
	}

	public static void main(String[] args) {

		Week1Lesson2 w1l2 = new Week1Lesson2();

		System.out.println("Calculating ");
		w1l2.convert(11.56);
		System.out.println("Array without Duplicates:");
		String[] arr = { "horse", "dog", "cat", "dog", "horse", "donkey" };
		w1l2.removeDups(arr);
		System.out.println("Draw Checkboard: ");
		w1l2.drawCheckBoard(8);
		System.out.println("Calculate weight in different planets: ");
		System.out.println("Weight = " + w1l2.calculateWeight());
		System.out.println("Counting Result of students: ");
		w1l2.countResult();
		System.out.println("Producing complex userName: ");
		System.out.println("user name: " + w1l2.produceUserName());
		System.out.println("Checking if a number is palindrome: ");
		if (w1l2.isPalindrome(7897))
			System.out.println("The number is Palindrome");
		else
			System.out.println("The number is not Palindrome");
		System.out.println("Checking if a given year is leap or not: ");
		if (w1l2.isLeapYear(2010))
			System.out.println("The year is leap year");
		else
			System.out.println("The year is not leap year");
		System.out.println(" Encription: " + w1l2.encrypt());
		System.out.println("Decreption: " + w1l2.decrypt());

	}
}
