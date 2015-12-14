package week3lesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		public BinaryNode getRight() {
			return right;
		}

		public BinaryNode getLeft() {
			return left;
		}

		public int getElement() {
			return element;
		}

	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.getElement() + " ");
			preOrder(t.getLeft());
			preOrder(t.getRight());
		}

	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.getLeft());
			postOrder(t.getRight());
			System.out.print(t.getElement() + " ");
		}
	}

	public boolean contains(int key) {
		boolean found = false;
		while ((root != null) && !found) {
			int rootData = root.getElement();
			if (key < rootData)
				root = root.getLeft();
			else if (key > rootData)
				root = root.getRight();
			else {
				found = true;
				break;
			}
			contains(key);
		}
		return found;
	}

	public BinaryNode getRoot() {

		return root;
	}

	public int leafNodes(BinaryNode t) {
		if (t == null)
			return 0;

		if (t.left == null && t.right == null)
			return 1;
		else
			return leafNodes(t.left) + leafNodes(t.right);
	}

	public int size() {
		return getSize(root);
	}

	private int getSize(BinaryNode t) {

		if (t == null)

			return 0;

		else

			return 1 + getSize(t.left) + getSize(t.right);

	}

	public boolean isLeaf() {

		if (root.left == null && root.right == null)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		System.out.println("PostOrder:  ");

		mybst.postOrder(mybst.root);
		System.out.println();
		System.out.println("PreOrder: ");
		
		mybst.preOrder(mybst.root);
		mybst.insert(12);
		mybst.printTree();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
}
/*
PostOrder:  
2 3 1 9 12 25 22 19 16 100 56 15 
PreOrder: 
15 12 9 1 3 2 56 16 19 22 25 100 1,2,3,9,12,15,16,19,22,25,56,100,
After inserting 0th item 15
15 

After inserting 1th item 12
12 15 

After inserting 2th item 9
9 12 15 

After inserting 3th item 56
9 12 15 56 

After inserting 4th item 1
1 9 12 15 56 

After inserting 5th item 16
1 9 12 15 16 56 

After inserting 6th item 19
1 9 12 15 16 19 56 

After inserting 7th item 22
1 9 12 15 16 19 22 56 

After inserting 8th item 3
1 3 9 12 15 16 19 22 56 

After inserting 9th item 100
1 3 9 12 15 16 19 22 56 100 

After inserting 10th item 2
1 2 3 9 12 15 16 19 22 56 100 

After inserting 11th item 25
1 2 3 9 12 15 16 19 22 25 56 100 
Welcome, World!
*/