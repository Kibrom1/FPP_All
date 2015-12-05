package weeek2lesson5;

import java.time.LocalDate;
import java.util.Date;

public class Manager implements Employee {
	String employeeName;
	String employeeId;
	String socialSecurityNumber;
	Date dateOfBirth;
	String address;
	double salary;
	int numberOfHours;
	int experience;
	int extraHours;

	public Manager(String employeeName, String employeeId, String socialSecurityNumber, String address,
			Date dateOfBirth) {
		// TODO Auto-generated constructor

		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee's Name: " + this.employeeName);
		System.out.println("Employee's Id: " + this.employeeId);
		System.out.println("Employee's SSN: " + this.socialSecurityNumber);
		System.out.println("Employee's BirthDate: " + this.dateOfBirth);
		System.out.println("Employee's address: " + this.address);

	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double monthlySalary = this.numberOfHours * 2 * baseSalary;
		double extraSalary = 0;
		if (this.numberOfHours > 150)
			extraSalary = (this.numberOfHours - 150) * extraHours;

		return monthlySalary + extraSalary;
	}

}

