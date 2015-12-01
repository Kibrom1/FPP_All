package week2lesson5;

import java.util.Scanner;

//main class to test inheritance of parent class and child class
public class Main {

	public static void main(String[] args) {

		Professor prof1 = new Professor("Richard", 10000, 2);
		Professor prof2 = new Professor("Helen", 5500, 3);
		Professor prof3 = new Professor("Jhon", 6000, 4);
		Secretary sec1 = new Secretary("Nina", 3500, 50);
		Secretary sec2 = new Secretary("Soliana", 3000, 60);
		DeptEmployee[] departments = new DeptEmployee[5];
		departments[0] = prof1;
		departments[1] = prof2;
		departments[2] = prof3;
		departments[3] = sec1;
		departments[4] = sec2;

		double totalProfessorSalary = 0, totalSecretarySalary = 0, totalDeptSalary = 0;
		System.out.println("Do you want the total salaries? ");
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
		String lowerResponse = response.toLowerCase();
		if (lowerResponse.equals("yes")) {

			for (DeptEmployee dept : departments) {
				if (dept instanceof Professor)
					totalProfessorSalary += dept.computeSalary();
				else if (dept instanceof Secretary)
					totalSecretarySalary += dept.computeSalary();
				totalDeptSalary += dept.computeSalary();
			}
			System.out.println("The total professor's salary is " + totalProfessorSalary);
			System.out.println("The total secretary's salary is " + totalSecretarySalary);
			System.out.println("The total department's salary is " + totalDeptSalary);

		}
		System.out.println("You are not interested to see the sum of salaries, Good bye");

	}

}
