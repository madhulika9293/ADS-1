
class LinkedList<E> {
	private class Node {
		private E data;
		private Node next;
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node head;

	boolean insertAt(int index, E ele) {
		boolean flag = false;
		try {
			head = insertHelper(head, index, ele);
		} catch (Exception e) {
			System.out.println("Can't insert at this position.");
			flag = true;
		}
		return flag;
	}

	Node insertHelper(Node head, int cnt, E ele) {
		if (cnt == 0) return new Node(ele, head);
		head.next = insertHelper(head.next, cnt - 1, ele);
		return head;
	}

	void reverse() {
		head = reverseHelper(head);
	}

	Node reverseHelper(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node temp = reverseHelper(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}

	public String print() {
		Node temp = head;
		String out  = "";
		while (temp != null) {
			out += temp.data + ", ";
			temp = temp.next;
		}
		return out.substring(0 , out.length() - 2);
	}

}
