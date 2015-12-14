package week3lesson8;

class CircularDirectory {
	String name;
	long pno; // Phone number
	CircularDirectory next;

	public CircularDirectory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + (int) (pno ^ (pno >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CircularDirectory other = (CircularDirectory) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (pno != other.pno)
			return false;
		return true;
	}

	// -------------------------------------------------------------
	public void displayDirectory() { // display values of single element

		System.out.println("Name: " + name + " Phon Number: " + pno);
	}
}

class CircularDirectoryOpr {
	private CircularDirectory first; // ref to first Directory
	private CircularDirectory last; // ref to last Directory
	private int size = 0;

	// -------------------------------------------------------------
	public CircularDirectoryOpr() { // constructor

		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	// Getters
	public CircularDirectory getFirst() {
		return first;
	}

	public CircularDirectory getLast() {
		return last;
	}

	public boolean isEmpty() {// true if no Directory in your list

		if (first == null)
			return true;
		return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) { // insert at front of list

		CircularDirectory newDir;
		if (first == null) {
			newDir = new CircularDirectory(name, pno);
			first = newDir;
			last = first;
			first.next = last;
			last.next = first;
		} else {
			newDir = new CircularDirectory(name, pno);
			newDir.next = first;
			first = newDir;
			last.next = first;
		}
		size++;
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) {// insert at end of list

		CircularDirectory newDir;
		if (first == null) {
			newDir = new CircularDirectory(name, pno);
			first = newDir;
			last = first;
			first.next = last;
			last.next = first;
		} else {
			newDir = new CircularDirectory(name, pno);
			last.next = newDir;
			last = newDir;
			last.next = first;
		}
		size++;
	}

	// -------------------------------------------------------------
	public CircularDirectory deleteFirst() // delete first Directory
	{
		CircularDirectory temp = null;
		if (first != null) {
			temp = first;
			first = first.next;
			last.next = first;
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
		CircularDirectory tempDir = first;
		while (!tempDir.equals(last)) {
			tempDir.displayDirectory();
			tempDir = tempDir.next;
		}
		last.displayDirectory();

	}

	// -------------------------------------------------------------
	public CircularDirectory find(String key) { // find link with given key
		CircularDirectory temp = first;
		while (temp.name != key) {
			temp = temp.next;
		}
		return temp;

	}
}

// -----------------------------------------------
public class SinglyCircularLinkedMain {
	public static void main(String[] args) {
		CircularDirectoryOpr dirOpr = new CircularDirectoryOpr();
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
		CircularDirectory dir = dirOpr.find("kibrom");
		System.out.println("Name: " + dir.name);

	}

}
//Output
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