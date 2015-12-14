package week3lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHomework {

	public static void numerDenom(int[] numer, int[] denom) {

		try {
			for (int i = 0; i < numer.length; i++) {
				System.out.println(numer[i] / denom[i]);

			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());

		} finally {
			System.out.println("control went down to the finally block");
		}
	}

	public static void validateMark() {
		System.out.println("Please Enter Mark");
		Scanner sc = new Scanner(System.in);
		int mark;
		try {
			mark = sc.nextInt();
			if (mark > 100 || mark < 0)
				throw new IllegalArgumentException("Mark should be non negative and less than 100");
			else
				System.out.println("Mark: " + mark);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} catch (InputMismatchException ex) {

			System.out.println("Enter should be only integer");
		} finally {
			System.out.println("Done!");
		}

	}

	public static void main(String[] args) {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		numerDenom(numer, denom);
		validateMark();

	}

}
