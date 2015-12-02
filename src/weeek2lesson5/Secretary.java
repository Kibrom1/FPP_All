package weeek2lesson5;

import java.time.LocalDate;
import java.util.Date;

//A class that implements the interface Employee
public class Secretary implements Employee {
	String employeeName;
	String employeeId;
	String socialSecurityNumber;
	Date dateOfBirth;
	String address;
	int numberOfHours;
	int experience;

	public Secretary(String employeeName, String employeeId, String socialSecurityNumber, String address,
			Date dateOfBirth) {
		// TODO Auto-generated constructor

		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double extrasalary = 0;
		double bonussalary = 0;
		int monthlySalary = this.numberOfHours * baseSalary * 10;
		if (this.experience > 5) {
			extrasalary = (monthlySalary * 10) / 100;

			if (this.numberOfHours > 150) {
				bonussalary = (this.numberOfHours - 150) * bonus;
			}
		}

		return monthlySalary + extrasalary + bonussalary;
	}

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee's Name: " + this.employeeName);
		System.out.println("Employee's Id: " + this.employeeId);
		System.out.println("Employee's SSN: " + this.socialSecurityNumber);
		System.out.println("Employee's BirthDate: " + this.dateOfBirth);
		System.out.println("Employee's address: " + this.address);
		System.out.println("Employee's number of hours: " + this.numberOfHours);
		System.out.println("Employee's Experience: " + this.experience);
	}

}
