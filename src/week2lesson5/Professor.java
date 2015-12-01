package week2lesson5;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	
	int numberOfPublications;
	public Professor(String name, double salary,int numberOfpublications) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		this.numberOfPublications = numberOfpublications;
	}

	

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
