package week3lesson9;

class Node implements Comparable {
	int value;
	Node next;

	Node(int item) {
		value = item;
	}

	public void displayAll() {
		System.out.print("(->: " + value + ")");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (value > (Integer) o)
			return 1;
		else if (value < (Integer) o)
			return -1;
		return 0;
	}
}

class PriorityQueueLinkedList {
	private Node front, rear;

	private int size;

	public PriorityQueueLinkedList() {

		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty() {

		return front == null;
	}

	public int size() {
		return size;
	}

	public void add(int vaue) {
		Node newNode = new Node(vaue);
		size++;
		if (isEmpty()) {
			front = rear = newNode;
			front.next = null;
		} else if (front == rear) {
			if (rear.value > newNode.value) {
				newNode.next = rear;
				front = newNode;
			} else {
				rear.next = newNode;
				front = rear;
				newNode.next = null;
			}
		}

		else {
			Node current = front;
			Node prevoius = null;
			while (current != null && newNode.value > current.value) {
				prevoius = current;
				current = current.next;
			}
			if (prevoius == null) {
				newNode.next = front;
				front = newNode;
			} else if (prevoius == front) {
				newNode.next = prevoius.next;
				front.next = newNode;
			} else if (prevoius == rear) {
				rear.next = newNode;
				rear = newNode;
				rear.next = null;
			}

			else {

				newNode.next = prevoius.next;

				prevoius.next = newNode;

			}

		}
	}

	public Node remove() {
		if (isEmpty())

			return null;
		Node temp = front;

		front = front.next;

		size--;
		return temp;
	}

	public Node peek() {
		if (isEmpty())
			return null;
		return front;
	}

	public String toString() {

		if (isEmpty()) {
			System.out.print("Empty Queue List");
			return "";
		}
		Node current = front;
		System.out.print("Front");

		while (current != null) {

			current.displayAll();
			current = current.next;
		}

		System.out.print("->Rear");
		System.out.println();

		return "";

	}

}

public class PriorityQueueLinkedListMain {

	public static void main(String[] args) {

		PriorityQueueLinkedList pq = new PriorityQueueLinkedList();

		pq.add(200);
		pq.add(430);
		pq.add(52);
		pq.add(91);
		pq.add(872);
		pq.add(552);
		pq.add(921);
		pq.add(87);

		System.out.println(pq);

		System.out.println("Removed Value: " + pq.remove().value);

		System.out.println("After removing");

		System.out.println(pq);

		System.out.println("Queue size: " + pq.size());

		System.out.println("Queue peek value: " + pq.peek().value);

		pq.remove();
		pq.remove();
		pq.remove();
		pq.remove();

		System.out.println(pq);
		pq.remove();
		pq.remove();

	}

}
// Output
/*
 * Front(->: 52)(->: 87)(->: 91)(->: 200)(->: 430)(->: 552)(->: 872)(->:
 * 921)->Rear
 * 
 * Removed Value: 52 After removing Front(->: 87)(->: 91)(->: 200)(->: 430)(->:
 * 552)(->: 872)(->: 921)->Rear
 * 
 * Queue size: 7 Queue peek value: 87 Front(->: 552)(->: 872)(->: 921)->Rear
 */
