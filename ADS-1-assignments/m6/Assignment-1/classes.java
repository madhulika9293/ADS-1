class LinkedList {
	
	class Node {
		char data;
		Node next;

		Node() {}

		Node(char item1) {
			this.data = item1;
			this.next = null;
		}
	}

	private Node head;

	public void add(char item) {
		Node temp = new Node(item);
		temp.next = head;
		head = temp;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
