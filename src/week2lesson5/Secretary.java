package week2lesson5;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	int overTimeHours;
	public Secretary(String name, double salary, int overTimeHours) {
		super(name, salary);
		this.overTimeHours = overTimeHours;
		// TODO Auto-generated constructor stub
	}

	

	public int getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(int overTimeHours) {

		this.overTimeHours = overTimeHours;
	}

	public double computeSalary() {
		return salary + 12 * overTimeHours;
	}

}
