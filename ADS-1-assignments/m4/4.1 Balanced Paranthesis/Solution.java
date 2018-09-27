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
   * Gets the head.
   *
   * @return     The head.
   */
  public void getHead() {
    System.out.println(head.data);
  }

  /**
   * Gets the tail.
   *
   * @return     The tail.
   */
  public void getTail() {
    System.out.println(tail.data);
  }
  /**
   * Adds data at head.
   *
   * @param      dt    data of type generic to be added to the list.
   */
  public void addAtHead(final E dt) {
    Node temp = new Node(dt, head);
    if (head == null) {
      head = temp;
      tail = head;
      return;
    }
    head = temp;
  }

  /**
   * Adds an at tail.
   *
   * @param      dt    data to be stored in the list.
   */
  public void addAtTail(final E dt) {
    tail.next = new Node(dt);
    tail = tail.next;
  }

  /**
   * Pops a value from the head of the list.
   *
   * @return     Last value which is of generic type.
   */
  public E popAtHead() {
    E out = head.data;
    head = head.next;
    return out;
  }

  /**
   * Pops a node at the tail of the list.
   *
   * @return     Data of the popped node.
   */
  public E popAtTail() {
    Node temp = head;
    while (temp != null && temp.next != tail) {
      temp = temp.next;
    }
    E element = temp.next.data;
    temp.next = null;
    tail = temp;
    return element;
  }

  public void print() {
    Node temp = new Node();
    temp = head;
    while (temp.next != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.print(temp.data);
    System.out.println();
  }
}

/**
 * Class for solution. This implements the linked list for our problem.
 */
public final class Solution {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int num = Integer.parseInt(scan.nextLine());

    for (int i = 0; i < num; i++) {

      LinkedList<String> lstB = new LinkedList<>();

      String[] inp = scan.nextLine().split("");
      // System.out.println(Arrays.toString(inp));

      String out = "YES";

      for (int j = 0; j < inp.length; j++) {
        if (inp[j] == "[" || inp[j] == "{" || inp[j] == "(") {
          lstB.addAtHead(inp[j]);
        } else if (inp[j] == "]" && lstB.popAtHead() != "[") {
          out = "NO";
        } else if (inp[j] == "}" && lstB.popAtHead() != "{") {
          out = "NO";
        } else if (inp[j] == ")" && lstB.popAtHead() != "(") {
          out = "NO";
        }
      }

      System.out.println(out);

    }
  }
}

