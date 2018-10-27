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
   * For inserting - constant time as Linear probing hash table
   *                          was used.

   * For searching - constant time as Linear probing hash table
   *                          was used.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    final int three = 3;
    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());

    LinearProbingHashST<Integer, Student> section =
      new LinearProbingHashST<>(three * n);

    for (int i = 0; i < n; i++) {
      String[] inp = scan.nextLine().split(",");
      Student temp = new Student(Integer.parseInt(inp[0]),
                                 inp[1],
                                 Double.parseDouble(inp[2]));
      section.put(Integer.parseInt(inp[0]), temp);
    }

    int m = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < m; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[2]) {
      case "1":
        try {
          System.out.println(section.get(
                               Integer.parseInt(tokens[1])).getName());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      case "2":
        try {
          System.out.println(section.get(
                               Integer.parseInt(tokens[1])).getMarks());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      default:
        break;
      }
    }

  }
}

