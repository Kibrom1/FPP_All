package week3lesson9;

import java.util.Stack;

interface arrayQueue {
	public void add(Object item);

	public Object remove();

	public boolean isEmpty();

	public int size();

	public Object peek();
}

class ArrayQueue implements arrayQueue {
	private Object obj[];
	int front, rear;

	public ArrayQueue(int n) {
		// TODO Auto-generated constructor stub
		obj = new Object[n];
		front = -1;
		rear = -1;
	}

	public void add(Object item) {
		if (rear == obj.length - 1) {
			System.out.println("The queue is full");
			return;
		} else if (front == -1) {
			front = 0;
			rear = 0;
			obj[rear] = item;
		} else {
			rear++;
			obj[rear] = item;
		}

	}

	public Object remove() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return null;
		}

		else {
			Object item = obj[front];
			front++;
			rear--;
			return item;
		}
	}

	public boolean isEmpty() {
		if (front == -1)
			return true;
		return false;
	}

	public int size() {
		return rear + 1;
	}

	public Object peek() {

		if (isEmpty())
			return null;

		return obj[front];

	}

	public String toString() {
		return obj.toString();

	}

}

public class ArrayQueueDemo {
	public static boolean stringIsPalindrome(String str) {

		Stack<Character> stk = new Stack<>();
		for (int i = 0; i < str.length(); i++)
			stk.push(str.charAt(i));
		for(int i = 0; i< (str.length()/2) + 1; i++)
			if(str.charAt(i) != stk.pop())
				return false;
		return true;
	}

	public static void main(String[] args) {
		ArrayQueue arrq = new ArrayQueue(4);

		arrq.add(20);
		arrq.add(30);
		arrq.add(70);
		System.out.println("Size: " + arrq.size());
		System.out.println("Front: " + arrq.front);
		System.out.println("Rear: " + arrq.rear);
		System.out.println("Empty: " + arrq.isEmpty());
		System.out.println("Peek: " + arrq.peek());
		arrq.remove();
		System.out.println("Peek: " + arrq.peek());
		System.out.println("All values: " + arrq);
		System.out.println(arrq.remove());
		System.out.println(arrq.size());
		System.out.println(stringIsPalindrome("cbck"));
	}

}
