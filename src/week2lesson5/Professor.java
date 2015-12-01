package week2lesson5;

//child class of DeptEmplyee parent class
public class Professor extends DeptEmployee {

	int numberOfPublications;

	public Professor(String name, double salary, int numberOfpublications) {
		super(name, salary);
		this.numberOfPublications = numberOfpublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
