/**
 * Linked list implementation class.
 *
 * @param      <E>   { parameter_description }
 */
class LinkedList<E> {
    /**
     * Class for node.
     */
    private class Node {
        /**
         * Class variable to store list data.
         */
        E data;
        /**
         * Class variable to store the address of the successor.
         */
        Node next;

        /**
         * Constructs the object.
         */
        Node() {}

        /**
         * Constructs the object.
         *
         * @param      data  The data.
         */
        Node(E data) {
            this(data, null);
        }

        /**
         * Constructs the object.
         *
         * @param      data  The data.
         * @param      next  The next address.
         */
        Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Class variable to track head.
     */
    private Node head;

    /**
     * Function to add an element to the list.
     *
     * @param      e  an element.
     */
    public void add(E e) {
        Node node = new Node();
        node.data = e;
        node.next = head;

        if (head == node) {
            head = node;
        }

        head = node;
    }

    /**
     * Pop function for the list.
     *
     * @return     The element popped.
     */
    public E pop1() {
        E data = head.data;
        head = head.next;
        return data;
    }

    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty1() {
        return head == null;
    }

}

/**
 * Class for stack 1.
 *
 * @param      <E>   Generic data type.
 */
public class Stack1<E> {

    /**
     * Using Linked Lists.
     */
    LinkedList<E> list;

    /**
     * Constructs the object.
     */
    Stack1() {
        list = new LinkedList<>();
    }

    /**
     * Push function for the stack.
     *
     * @param      e     item to be added.
     */
    public void push(E e) {
        list.add(e);
    }

    /**
     * Pop function for the stack.
     *
     * @return     The last item.
     */
    public E pop() {
        E c = list.pop1();
        return c;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return list.isEmpty1();
    }
}