import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution. This implements the linked list for our problem.
 */
public final class Solution {

  public static boolean balParen(final String s) {

    Stack<String> sInp = new Stack<String>();

    String[] sArr = s.split("");

    for (int i = 0; i < s.length(); i++) {

      if (sArr[i].equals("[") || sArr[i].equals("{") || sArr[i].equals("(")) {
        sInp.push(sArr[i]);
      } else if (sArr[i].equals("]") && sInp.pop() != "[") {
        return false;
      } else if (sArr[i].equals("}") && sInp.pop() != "{") {
        return false;
      } else if (sArr[i].equals(")") && sInp.pop() != "(") {
        return false;
      }
    }

    return true;

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int num = Integer.parseInt(scan.nextLine());

    for (int i = 0; i < num; i++) {

      String inp = scan.nextLine();

      if (balParen(inp)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
  }
}

