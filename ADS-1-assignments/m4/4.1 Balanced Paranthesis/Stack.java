import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for implementing linked list.
 *
 * @param      <E>   generic data type.
 */
class LinkedList<E> {
  /**
   * Class for node.
   */
  private class Node {
    /**
     * data of generic data type.
     */
    E data;
    /**
     * Node object for pointing to the next node.
     */
    Node next;

    /**
     * Default empty constructor.
     */
    Node() {}

    /**
     * Constructs the object - overloaded.
     *
     * @param      data  The data
     */
    Node(E data1) {
      this.data = data1;
      this.next = null;
    }

    /**
     * Constructs the object - overloaded.
     *
     * @param      data1  The data
     * @param      next1  The next node pointer.
     */
    Node(E data1, Node next1) {
      this.data = data1;
      this.next = next1;
    }
  }
  /**
   * Objects of type node for keeping track of head & tail of the list.
   */
  private Node head, tail;

  /**
   * Adds data at head.
   *
   * @param      dt    data of type generic to be added to the list.
   */
  public void add(final E dt) {
    Node temp = new Node(dt, head);
    if (head == null) {
      head = temp;
      tail = head;
      return;
    }
    head = temp;
  }

  /**
   * Pops a value from the head of the list.
   *
   * @return     Last value which is of generic type.
   */
  public E pop() {
    E out = head.data;
    head = head.next;
    return out;
  }

}

/**
 * Stack class.
 *
 * @param      <E>   { parameter_description }
 */
public class Stack<E> {

  private LinkedList<E> stack;

  /**
   * Constructs the object.
   */
  Stack() {
    stack = new LinkedList<E>();
  }

  /**
   * Pushes an item into the stack.
   *
   * @param      item  The item
   */
  public void push(final E item) {
    stack.add(item);
  }

  /**
   * pops the last element in the stack.
   *
   * @return     element from the stack.
   */
  public E pop() {
    return stack.pop();
  }
}
