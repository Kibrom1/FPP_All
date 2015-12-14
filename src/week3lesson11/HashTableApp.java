package week3lesson11;

//demonstrates hash table user defined implementation with linear probing

import java.io.*;
import java.util.Scanner;

////////////////////////////////////////////////////////////////
class DataItem { // (could have more data)
	private String iData; // data item (key)
	private String value;

	// --------------------------------------------------------------
	public DataItem(String ii, String v) // constructor
	{
		iData = ii;
		value = v;
	}

	// --------------------------------------------------------------
	public String getKey() {
		return iData;
	}

	public String getValue() {
		return value;
	}
	// --------------------------------------------------------------
} // end class DataItem
	////////////////////////////////////////////////////////////////

class HashTable {
	private DataItem[] hashArray; // array holds hash table
	private int arraySize;
	private DataItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = null; // deleted item key is -1
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
			else
				System.out.println("Index : " + j + " " + "**");
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public int hashFunc(String keys) {
		int key = 0;
		int length = keys.length();
		for (int i = 0; i < keys.length(); i++) {
			key += keys.charAt(i) * Math.pow(31, length);
			length--;
		}
		return key % arraySize; // hash function
	}

	// -------------------------------------------------------------
	public void insert(String key, String v) // insert a DataItem
	// (assumes table not full)
	{
		// extract key
		int hashVal = hashFunc(key); // hash the key
										// until empty cell
		// an index have some data and not match with existing key, it find next
		// vacant position
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != key) {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		DataItem obj = new DataItem(key, v);
		hashArray[hashVal] = obj; // insert item
	} // end insert()
		// -------------------------------------------------------------

	public DataItem delete(String key) // delete a DataItem
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				return temp; // return item
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
		// -------------------------------------------------------------

	public boolean find(String key) // find item with key
	{
		int hashVal = hashFunc(key); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getKey() == key)
				return true; // yes, return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return false; // can't find item
	}
	// -------------------------------------------------------------
} // end class HashTable
	////////////////////////////////////////////////////////////////

class HashTableApp {
	public static void main(String[] args) throws IOException {
		System.out.println(Math.pow(3, 4));
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();
		HashTable theHashTable = new HashTable(size);

		// System.out.println(theHashTable.hashFunc("hagos"));
		theHashTable.insert("F", "FPP");
		theHashTable.insert("J", "Java");
		theHashTable.insert("S", "SE");
		theHashTable.insert("C", "C#");
		// theHashTable.insert("Kibrom", "hagos");

		while (true) // interact with user
		{
			System.out.println("Enter first letter of ");
			System.out.println("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); // Read a Char from the console
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.println("Enter key and value to insert: ");
				aKey = in.next();
				value = in.next();
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.println("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.println("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status" + theHashTable.find(aKey));
				break;
			default:
				System.out.println("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// --------------------------------------------------------------
} // end class HashTableApp
	////////////////////////////////////////////////////////////////
