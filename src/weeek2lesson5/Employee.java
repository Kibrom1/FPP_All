package weeek2lesson5;

public interface Employee {

	final int baseSalary = 10;
	final int bonus = 2;
	final int extraHours = 15;

	public abstract void getEmployeeDetails();

	public abstract double calculateSalary();
}
