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

//Output
//===========
/*Calculate Manager's Salary. 
Enter Number of Hours: 
170
Enter Number of extrahours: 
20
Enter Experience: 
7
Employee's Name: Jhon
Employee's Id: 003
Employee's SSN: 00Au
Employee's BirthDate: Thu Jan 15 00:09:00 CST 1976
Employee's address: New york
Salary : 3800.0
Calculate Secretary's Salary. 
Enter  Number of Hours: 
175
Enter experience: 
8
Employee's Name: Selina
Employee's Id: 001
Employee's SSN: Eth11
Employee's BirthDate: Thu Jan 15 00:09:00 CST 1976
Employee's address: Fairfield
Employee's number of hours: 175
Employee's Experience: 8
Salary : 19300.0
*/