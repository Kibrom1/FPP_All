package week2lesson7;

import java.util.Scanner;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "Charlie");

		System.out.println();
		// To keep adding to Entry array
		String entryValue;
		char entryKey;
		Scanner in = new Scanner(System.in);
		char c = 'y', c1 = 'y';
		do {

			System.out.print("Do you want to add More? (Y/N)");
			c = in.nextLine().toLowerCase().charAt(0);
			if (c == 'y') {
				System.out.println("Enter string: ");
				entryValue = in.nextLine();
				System.out.println("Enter Index you want to put it: ");
				entryKey = in.nextLine().charAt(0);
				t.add(entryKey, entryValue);
				System.out.println();
			}
		} while (c == 'y');
		// Displaying the whole entry
		System.out.println("Displaying the content of Entry array:");
		System.out.println(t);
		// To get String by char
		do {
			System.out.print("Do you want to see by character?(Y/N): ");
			c1 = in.nextLine().charAt(0);
			if (c1 == 'y') {
				System.out.println("Enter character: ");
				char ch = in.nextLine().charAt(0);
				String value = t.get(ch);
				System.out.println(value);
			}
		} while (c1 == 'y');
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		int index = (int) c;
		if (entries[index - 97] != null)
			return entries[index - 97].value;
		else
			return null;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int asciVal = (int) c;
		entries[asciVal - 97] = new Entry(s, c);
		System.out.println(entries[asciVal - 97]);
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		String val = "";
		String newline = System.getProperty("line.separator");
		for (int i = 0; i < 26; i++) {
			if (entries[i] != null)
				val = val + entries[i].key + "->" + entries[i].value + newline;
		}
		return val;
	}

	private class Entry {
		String value;
		char key;

		Entry(String value, char key) {
			this.value = value;
			this.key = key;
		}

		// returns a String of the form "ch->str"
		public String toString() {

			return this.key + "->" + this.value;
		}
	}

}

//output
//====
/*
a->Andrew
b->Billy
c->Charlie

Do you want to add More? (Y/N)y
Enter string: 
Kibrom
Enter Index you want to put it: 
k
k->Kibrom

Do you want to add More? (Y/N)y
Enter string: 
Abraha
Enter Index you want to put it: 
a
a->Abraha

Do you want to add More? (Y/N)n
Displaying the content of Entry array:
a->Abraha
b->Billy
c->Charlie
k->Kibrom

Do you want to see by character?(Y/N): 
	*/
