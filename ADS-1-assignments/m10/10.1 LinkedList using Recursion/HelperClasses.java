/**
 * Class for linked list.
 *
 * @param      <E>   Generic representation.
 */
class LinkedList<E> {
	/**
	 * Class for node.
	 */
	private class Node {
		/**
		 * Data in the node.
		 */
		private E data;
		/**
		 * Data for the next node.
		 */
		private Node next;
		/**
		 * Constructs the object.
		 *
		 * @param      data  The data
		 * @param      next  The next node
		 */
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	/**
	 * Head variable.
	 */
	Node head;

	/**
	 * Inserts an element into a list.
	 *
	 * Complexity : N
	 *
	 * @param      index  The index
	 * @param      ele    The element
	 *
	 * @return     Boolean flag to know when exceptions were encountered.
	 */
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
	/**
	 * Helper code for inserting an element.
	 *
	 * Complexity : N
	 *
	 * @param      head  The head
	 * @param      cnt   The count
	 * @param      ele   The element
	 *
	 * @return     New head node.
	 */
	Node insertHelper(Node head, int cnt, E ele) {
		if (cnt == 0) return new Node(ele, head);
		head.next = insertHelper(head.next, cnt - 1, ele);
		return head;
	}

	/**
	 * Reverses the list.
	 */
	void reverse() {
		head = reverseHelper(head);
	}

	/**
	 * Reverse function helper.
	 *
	 * Complexity : N
	 *
	 * @param      head  The head
	 *
	 * @return     New head node.
	 */
	Node reverseHelper(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node temp = reverseHelper(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}

	/**
	 * Prints the list.
	 *
	 * @return     String representation of the object.
	 */
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
