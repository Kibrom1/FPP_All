package week3lesson8;

public class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) { // constructor to
														// initialize the values
	}

	public void displayPerson() // Display fisrtName, lastName and age
	{
	}

	public String getLastName() // get only the last name
	{
		return lastName;
	}
} // end class Person

class PersonArrayOpe {
	private Person[] a; // reference to array
	private int nElems; // number of data items

	private int size;

	public PersonArrayOpe(int max) // constructor to initialize person array
									// with size max and nElems;
	{
	}

	public Person find(String searchName) // Pass Lastname as an argument
	{
		return new Person("Array", "Integer", nElems);
	}

	public void insert(String last, String first, int age)// Insert at last
	{
	}

	public boolean delete(String searchName) // Shift down the elements.
												// Argument should be lastname
	{
		return false;
	}

	public void displayAll() // displays array contents
	{
	}

	public int size() // Return the number of persons stored in the array
	{
		return 0;
	}

	private void resize() {
	}
}