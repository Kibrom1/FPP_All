package week2lesson5;

//child class of DeptEmplyee parent class
public class Secretary extends DeptEmployee {
	int overTimeHours;

	public Secretary(String name, double salary, int overTimeHours) {
		super(name, salary);
		this.overTimeHours = overTimeHours;
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
