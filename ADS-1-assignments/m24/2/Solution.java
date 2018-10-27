import java.util.Scanner;

/**
 * Class for Solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
    // unused
  }

  /**
   * Main method.
   *
   * Complexity (average case):
   *
   * For inserting - logarithmic time as BST was used.

   * For searching - logarithmic time as BST was used.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());

    BST<Student, Integer> section = new BST<>();

    for (int i = 0; i < n; i++) {
      String[] inp = scan.nextLine().split(",");
      Student temp = new Student(Integer.parseInt(inp[0]),
                                 inp[1],
                                 Double.parseDouble(inp[2]));
      section.put(temp, Integer.parseInt(inp[0]));
    }

    int m = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < m; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "BE":
        double min = Double.parseDouble(tokens[1]);
        double max = Double.parseDouble(tokens[2]);
        for (Student each : section.keys()) {
          if (each.getMarks() >= min
              && each.getMarks() <= max) {
            System.out.println(each);
          }
        }
        break;
      case "LE":
        double bound = Double.parseDouble(tokens[1]);
        for (Student each : section.keys()) {
          if (each.getMarks() <= bound) {
            System.out.println(each);
          }
        }
        break;
      case "GE":
        double bound1 = Double.parseDouble(tokens[1]);
        for (Student each : section.keys()) {
          if (each.getMarks() >= bound1) {
            System.out.println(each);
          }
        }
        break;
      default:
        break;
      }
    }

  }
}

