package week3lesson9;

class ArrQueue {

	private Object[] data;
	private int rear;
	private int front;
	private int size;
	private int numberOfElements;

	public ArrQueue(int size) {

		this.rear = -1;
		this.front = 0;
		this.size = size;
		this.data = new Object[size];
		this.numberOfElements = 0;

	}

	public void add(Object item) {

		if (rear == size - 1)
			reSize();
		data[++rear] = item;
		numberOfElements++;

	}

	public boolean isEmpty() {

		return numberOfElements == 0;

	}

	public int size() {

		return numberOfElements;

	}

	public int capacity() {

		return size;
	}

	public Object remove() {

		if (isEmpty())

			return null;

		Object temp = data[front++];

		numberOfElements--;

		return temp;

	}

	public String toString() {

		if (isEmpty())

			return "Empty Queue";

		String str = "";

		for (int i = front; i < rear + 1; i++) {

			str += "->(" + data[i] + ")";

		}
		return str;

	}

	public Object peek() {

		if (isEmpty())

			return null;

		return (data[front]);

	}

	private void reSize() {

		this.size = size * 2;
		Object[] temp = new Object[size];
		System.arraycopy(data, 0, temp, 0, size / 2);
		data = temp;
	}
}

public class ArrayQueues {
	public static void main(String[] args) {

		ArrQueue arrQueue = new ArrQueue(4);

		arrQueue.add(102);
		arrQueue.add(3);
		arrQueue.add(30);
		arrQueue.add(202);

		System.out.println(arrQueue);

		System.out.println("Size: " + arrQueue.size());

		System.out.println("Capcity: " + arrQueue);
		System.out.println("Remove: " + arrQueue.remove());

		System.out.println("Size after removing: " + arrQueue.size());

		System.out.println(arrQueue);

		arrQueue.remove();
		arrQueue.remove();
		System.out.println(arrQueue);
		arrQueue.remove();
		System.out.println(arrQueue);
		arrQueue.remove();
		System.out.println(arrQueue);
		System.out.println("Size " + arrQueue.size());

		System.out.println("Capacity " + arrQueue.capacity());

		arrQueue.add(40);

		System.out.println(arrQueue);

		System.out.println("Size " + arrQueue.size());

		System.out.println("Capacity " + arrQueue.capacity());

	}

}
//Output
/*
 ->(102)->(3)->(30)->(202)
Size: 4
Capcity: ->(102)->(3)->(30)->(202)
Remove: 102
Size after removing: 3
->(3)->(30)->(202)
->(202)
Empty Queue
Empty Queue
Size 0
Capacity 4
->(40)
Size 1
Capacity 8
 * */

