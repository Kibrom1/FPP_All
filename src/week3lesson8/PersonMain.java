package week3lesson8;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) { // constructor to
														// initialize the values
		this.lastName = last;
		this.firstName = first;
		this.age = a;
	}

	public void displayPerson() { // Display fisrtName, lastName and age

		System.out.println("Full Name: " + lastName + "," + firstName + " Age: " + age);
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

	public PersonArrayOpe(int max) { // constructor to initialize person array
										// with size max and nElems;
		a = new Person[max];
		size = 0;
	}

	public Person find(String searchName) // Pass Lastname as an argument
	{
		Person person = null;
		for (int i = 0; i < size - 1; i++) {
			if (a[i].getLastName().equals(searchName)) {
				person = a[i];
			}
		}
		return person;
	}

	public void insert(String last, String first, int age) { // Insert at last
		if (size == a.length)
			resize();
		a[size++] = new Person(last, first, age);
	}

	public boolean delete(String searchName) { // Shift down the elements.
		int index = -1;// Argument should be lastname
		if (size == 0)
			return false;
		for (int i = 0; i < size - 1; i++) {
			if (a[i].getLastName().equals(searchName)) {
				index = i;
				break;
			}
		}
		if(index == -1)
			return false;
		Person[] temp = new Person[a.length];
		System.arraycopy(a, 0, temp, 0, index);
		System.arraycopy(a, index + 1, temp, index, a.length - (index + 1));
		a = temp;
		--size;

		return true;
	}

	public void displayAll() { // displays array contents
		for (int i = 0; i < size - 1; i++) {
			a[i].displayPerson();
		}

	}

	public int size() { // Return the number of persons stored in the array

		return size;
	}

	private void resize() {
		System.out.println("resizing");
		int len = a.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(a, 0, temp, 0, len);
		a = temp;

	}
}

public class PersonMain {

	public static void main(String[] args) {
		PersonArrayOpe person = new PersonArrayOpe(12);
		person.insert("Josh", "Agua", 28);
		person.insert("Oliver", "Mark", 50);
		person.insert("Frank", "Jan", 48);
		person.insert("Jhon", "Mark", 70);
		System.out.println("Size: " + person.size());
		// System.out.println("Find: " + person.find("Jhon").getLastName());
		person.displayAll();
		System.out.println("Size: " + person.size());
		System.out.println("Deleted: " + person.delete("Josh"));

	}
}
//Output
/*

 Size: 4
Full Name: Josh,Agua Age: 28
Full Name: Oliver,Mark Age: 50
Full Name: Frank,Jan Age: 48
Size: 4
Deleted: true
 */
