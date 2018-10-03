import java.util.Scanner;
import java.util.Arrays;

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
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNext()) {
      String[] inputs = scan.nextLine().split(",");
      // Integer[] inpInt = new Integer[inputs.length];
      MergeSort.sort(inputs);
      System.out.println(Arrays.toString(inputs) + "\n");
    }
    scan.close();
  }
}
