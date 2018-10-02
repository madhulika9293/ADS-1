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
   * Prints out the leader board of given cricket teams.
   *
   * @param      tms   The tms
   * @param      sz    The size
   *
   * @return     String representation of the leader board.
   */
  public static String leaderBoard(final Team[] tms, final int sz) {
    InsertionSortTeam.sort(tms, sz);

    String out = "";
    for (int i = 0; i < sz; i++) {
      out += tms[i].toString();
      out += ",";
    }
    out = out.substring(0, out.length() - 1);
    return out;
  }

  /**
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);

    final int three = 3;
    final int ten = 10;

    Team[] teams = new Team[ten];
    int size = 0;

    while (scan.hasNext()) {
      String[] inp = scan.nextLine().split(",");
      Team temp = new Team(inp[0],
                           Integer.parseInt(inp[1]),
                           Integer.parseInt(inp[2]),
                           Integer.parseInt(inp[three]));
      teams[size] = temp;
      size += 1;
    }
    scan.close();
    System.out.println(leaderBoard(teams, size));
  }
}
