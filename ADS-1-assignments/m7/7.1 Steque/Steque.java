// import java.util.Iterable;
import java.util.Iterator;
/**
 * List of linkeds.
 */
public class Steque implements Iterable {
    /**
     * Class for node.
     */
    private class Node {
        /**
         * Variable to store data.
         */
        int data;
        /**
         * Variable to store the address of the following node.
         */
        Node next;
        /**
         * Constructs the object.
         */
        Node() {

        }
        /**
         * Constructs the object.
         *
         * @param      data  The data
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        /**
         * Constructs the object.
         *
         * @param      data  The data
         * @param      n     The node
         */
        Node(int data, Node n) {
            this.data = data;
            this.next = n;
        }
    }
    /**
     * Nodes to keep track of head and tail.
     */
    Node head, tail;
    /**
     * Variable to keep track of size of linked list.
     */
    int size = 0;
    /**
     * Constructs the object.
     */
    Steque() {

    }
    /**
     * Adds a node to the linked list.
     *
     * Has a complexity of 1.
     * @param      data  The data
     */
    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, head);
        head = node;
        size++;
    }
    /**
     * Adds a node at the end of the linked list.
     *
     *Has a complexity of 1.
     * @param      data  The data
     */
    public void enqueue(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }
    /**
     * Removes the latest added element.
     *
     * Has a complexity of 1.
     * @return     returns the latest added element.
     */
    public int pop() throws Exception {
        if (size <= 1) {
            if (size == 1) {
                head = head.next;
                size--;
            }
            throw new Exception("Steque is empty.");
        } else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * Has a complexity of N.
     * @return     String representation of the object.
     */
    public String toString() {
        Iterator i = iterator();
        if (size > 0) {
            String s = "";
            while (i.hasNext()) {
                s += i.next() + ", ";
                // i = i.next();
            }
            // System.out.println(s);
            return s.substring(0, s.length() - 2);
        }
        return null;
    }

    /**
     * Overriding default Iterator.
     *
     * @return     Head.
     */
    public Iterator iterator() {
        // System.out.println(head.data);
        return new StequeIterator(head);
    }

    /**
     * Class for steque iterator.
     */
    private class StequeIterator implements Iterator {
        Node current;
        /**
         * Constructs the object.
         *
         * @param      node  The node
         */
        StequeIterator(Node node) {
            this.current = node;

        }
        /**
         * Determines if it has next.
         *
         * @return     True if has next, False otherwise.
         */
        public boolean hasNext() { return current != null;}
        /**
         * Remove function unsupported.
         */
        public void remove() {/*not supported*/}
        /**
         * Returns the next element.
         *
         * @return     Next element
         */
        public Integer next() {
            Integer data = current.data;
            current = current.next;
            return data;
        }
    }
}

