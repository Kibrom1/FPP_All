package week3lesson8;

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() { // display values of single element

		System.out.println("Name: " + name + " Phon Number: " + pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory
	private int size = 0;

	// -------------------------------------------------------------
	public DirectoryOpr() { // constructor

		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() {// true if no Directory in your list

		if (first == null)
			return true;
		return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) { // insert at front of list

		Directory newDir;
		if (first == null) {
			newDir = new Directory(name, pno);
			first = newDir;
			last = first;
		} else {
			newDir = new Directory(name, pno);
			newDir.next = first;
			first = newDir;
		}
		size++;
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) {// insert at end of list

		Directory newDir;
		if (first == null) {
			newDir = new Directory(name, pno);
			first = newDir;
			last = first;
		} else {
			newDir = new Directory(name, pno);
			last.next = newDir;
			last = newDir;
		}
		size++;
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		Directory temp = null;
		if (first != null) {
			temp = first;
			first = first.next;
			size--;
		}

		return temp;

	}

	// -------------------------------------------------------------
	public int size() {
		return size;
	}

	// -------------------------------------------------------------
	public void displayList() {
		Directory tempDir = first;
		while (tempDir.next != null) {
			tempDir.displayDirectory();
			tempDir = tempDir.next;
		}
		last.displayDirectory();

	}

	// -------------------------------------------------------------
	public Directory find(String key) { // find link with given key
		Directory temp = first;
		while (temp.name != key) {
			temp = temp.next;
		}
		return temp;

	}
}
// -------------------------------------------------------------

public class PhoneDirectoryAPP {

	public static void main(String[] args) {
		DirectoryOpr dirOpr = new DirectoryOpr();
		dirOpr.insertFirst("kibrom", 91234567);
		dirOpr.insertLast("Hagos", 912345670);
		dirOpr.insertLast("Helenr", 125647897);
		dirOpr.insertFirst("Helen", 125647897);
		System.out.println("Size: " + dirOpr.size());
		dirOpr.displayList();
		System.out.println("After Deleting the last entry");
		dirOpr.deleteFirst();

		dirOpr.displayList();
		System.out.println("Size: " + dirOpr.size());
		Directory dir = dirOpr.find("kibrom");
		System.out.println("Name: " + dir.name);

	}

}
//output
/*
Size: 4
Name: Helen Phon Number: 125647897
Name: kibrom Phon Number: 91234567
Name: Hagos Phon Number: 912345670
Name: Helenr Phon Number: 125647897
After Deleting the last entry
Name: kibrom Phon Number: 91234567
Name: Hagos Phon Number: 912345670
Name: Helenr Phon Number: 125647897
Size: 3
Name: kibrom
*/
