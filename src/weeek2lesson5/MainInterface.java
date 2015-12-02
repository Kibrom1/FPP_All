package weeek2lesson5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MainInterface {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
		Date date1 = date.parse("1976-09-15");
		Secretary sec = new Secretary("Selina", "001", "Eth11", "Fairfield",date1);
		Manager man = new Manager("Jhon", "003", "00Au", "New york", date1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate Manager's Salary. ");
		System.out.println("Enter Number of Hours: ");
		int numberOfHours = sc.nextInt();
		man.numberOfHours = numberOfHours;
		System.out.println("Enter Number of extrahours: ");
		int extraHours = sc.nextInt();
		man.extraHours = extraHours;
		System.out.println("Enter Experience: ");
		int experience = sc.nextInt();
		man.experience = experience;

		man.getEmployeeDetails();
		System.out.println("Salary : " + man.calculateSalary());
	
		System.out.println("Calculate Secretary's Salary. ");
		System.out.println("Enter  Number of Hours: ");
		int secNumberOfHours = sc.nextInt();
		sec.numberOfHours = secNumberOfHours;
		System.out.println("Enter experience: ");
		int secExerience = sc.nextInt();
		sec.experience = secExerience;
		sec.getEmployeeDetails();
		System.out.println("Salary : " + sec.calculateSalary());

	}

}
