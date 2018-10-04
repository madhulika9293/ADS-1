import java.util.Scanner;

/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused constructor
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    int size = 0;
    String s = "";
    while (scan.hasNextLine()) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "insertAt":
        if (!list.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]))) {
          size ++;
          list.print();
        }
        break;
      case "reverse":
        if (size == 0) {
          System.out.println("No elements to reverse.");
          break;
        }
        list.reverse();
        break;
      default:
        break;
      }
    }
  }
}
