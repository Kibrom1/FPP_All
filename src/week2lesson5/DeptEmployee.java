package week2lesson5;

import java.time.LocalDate;

public class DeptEmployee {

	String name;
	double salary;
	LocalDate hireDate;

	public DeptEmployee(String name, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double computeSalary() {
		return salary;
	}

}
