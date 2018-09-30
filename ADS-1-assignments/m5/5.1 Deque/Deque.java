public class Deque<E> {
    private class Node {
        E data;
        Node next;
        // Node previous;
        Node() {

        }
        Node(E data) {
            this.data = data;
        }
        Node(E data, Node n/*, Node prev*/) {
            this.data = data;
            this.next = n;
            // this.previous = prev;
        }
    }
    Deque() {

    }
    Node head, tail;
    int size;
    public void pushLeft(E data) {
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
    public void pushRight(E data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(data, null);
        tail.next = node;
        tail = node;
        size++;
    }
    public int getSize() {
        return size;
    }
    public E popLeft() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }
        System.out.println("Deck is empty");
        return null;
    }
    public E popRight() {
        if (head != null) {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            E element = temp.next.data;
            temp.next = null;
            tail = temp;
            size--;
            return element;
        } else {
            System.out.println("Deck is empty");
            return null;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        if (head != null) {
            String s = "[";
            Node thead = head;
            while (thead.next != null) {
                s += (thead.data) + ", ";
                thead = thead.next;
            } s += (thead.data) + "]";
            return s;
        } else {
            return "[]";
        }
    }
}
