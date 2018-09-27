class LinkedList<E> {

	private class Node {

		E data;
		Node next;

		Node() {}

		Node(E data) {
			this(data, null);
		}

		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;

	public void add(E e) {
		Node node = new Node();
		node.data = e;
		node.next = head;

		if (head == node) {
			head = node;
		}

		head = node;
	}

	public E pop1() {
		E data = head.data;
		head = head.next;
		return data;
	}

	public boolean isEmpty1() {
		return head == null;
	}

}

public class Stack1<E> {

	/**
	 * Using Linked Lists.
	 */
	LinkedList<E> list;

	Stack1() {
		list = new LinkedList<>();
	}

	public void push(E e) {
		list.add(e);
	}

	public E pop() {
		E c = list.pop1();
		return c;
	}

	public boolean isEmpty() {
		return list.isEmpty1();
	}
}