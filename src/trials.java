import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javafx.util.converter.LocalDateStringConverter;

public class trials {

	public static void main(String[] args) {

		/*
		 * int a = (int)'\u1238'; System.out.println(a); System.out.println(
		 * "hello \" guys"); int x = 4; System.out.println(Math.floorMod(-5,
		 * 2)); System.out.println(-17%-12); int y = 5; x = y++;
		 * System.out.println(y); System.out.println(x++);
		 * System.out.println(x); char ch = (char)65.25; System.out.println(ch);
		 * for(int i=0, j=10; i < j; i++, j--) System.out.println("i and j: " +
		 * i + " " + j);
		 * 
		 * String s = "hello how,are,you,today"; String[] parsedVals =s.split(
		 * ",| "); for(String st: parsedVals) System.out.println(st); for(String
		 * st: args) System.out.println(st);
		 */
		/*
		 * Date d = new Date(); // Current Date System.out.println(d); Date d1 =
		 * new Date(1000000000); // set ne w Date System.out.println(d1);
		 * System.out.println(d.after(d1)); // true
		 * System.out.println(d1.after(d)); // false Date d2 = (Date)
		 * d1.clone(); // Making Deep copy System.out.println(d2);
		 * System.out.println(d.compareTo(d1)); // 1
		 * System.out.println(d1.compareTo(d)); // -1
		 * System.out.println(d1.equals(d2)); // true
		 * System.out.println(d1.equals(d)); // false
		 * System.out.println(d.getTime()); GregorianCalendar gc = new
		 * GregorianCalendar(); System.out.println(gc.get(Calendar.MONTH));
		 * System.out.println(gc.get(Calendar.DATE));
		 * 
		 * System.out.println(LocalDate.now());
		 * System.out.println(LocalDate.of(2006, 10, 25));
		 * System.out.println(localDateFormatter(LocalDate.now().toString()));
		 * 
		 * System.out.println(5.5f / 0.0f); // Infinity System.out.println(-5.5f
		 * / 0); // -Infinity int x = 4; int y = x++; System.out.println("X " +
		 * x + " and Y " + y); System.out.println((int) 1.7); // 1
		 * System.out.println((double) 1 / 2); // 0.5 System.out.println(1 / 2);
		 * // 0 char ch = (char) 65.25; System.out.println(ch); // A int i =
		 * (int) 'A'; System.out.println(i); // String name = "Maharishi";
		 * String nickname = name.substring(0, 3); // “Mah“ – From index 0 to
		 * last index (3-1) System.out.println(name.substring(0,
		 * name.length())); // " Maharishi" System.out.println(name.substring(0,
		 * 0)); // " " System.out.println(name.substring(4));
		 
		
		double dd = 10.0;
		System.out.printf("THe number %.2f",dd);
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a positive Number to sum: ");
			int value = sc.nextInt();
			if (value <= 0) {
				break;
			}
			sum = sum + value;
		}
		System.out.println("The sum is " + sum);
		Date d = new Date(); // Current Date
		System.out.println(d);
		Date d1 = new Date(1000000000); // set ne w Date
		System.out.println(d1);
		System.out.println(d.after(d1)); // true
		System.out.println(d1.after(d)); // false
		Date d2 = (Date) d1.clone(); // Making Deep copy
		System.out.println(d1);
		System.out.println(d.compareTo(d1)); // 1
		System.out.println(d1.compareTo(d)); // -1
		System.out.println(d1.equals(d2)); // true
		System.out.println(d1.equals(d)); // false
		System.out.println(d.getTime());*/
		System.out.println("Today's date: " + LocalDate.now()); // Current date
		System.out.println("Specified date: " + LocalDate.of(2000, 1, 1)); // Set a new Date
		String format = "MM/DD/YYYY";
		LocalDate date = LocalDate.of(2010,6,28);
		LocalDate date2 = LocalDate.of(1988, 5, 15);
		//String date1 = date.format(DateTimeFormatter.ofPattern(format));
		//System.out.println(date1);
		
		Period age = Period.between(date2, date);
		System.out.println("year= " + age.getYears() + " and Months = " + date2.getMonthValue() + " and Days "  +age.getDays());
	}

}
