import java.util.Scanner;

/**
 * Class for solution.
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
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    LinearProbingHashST<String, Integer> probe =
      new LinearProbingHashST<>();
    for (int i = 0; i < n; i++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "put":
        probe.put(tokens[1],
                  Integer.parseInt(tokens[2]));
        break;
      case "get":
        System.out.println(probe.get(tokens[1]));
        break;
      case "delete":
        probe.delete(tokens[1]);
        break;
      case "display":
        System.out.println(probe);
        break;
      default:
        break;
      }
    }
  }
}
