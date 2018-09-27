import java.util.Scanner;

/**
 * Class to check for balanced paranthesis.
 */
class Balparen {
  /**
   * inputs.
   */
  private char[] parenthesis;
  /**
   * Makes a stack of the given inputs.
   */
  private Stack1<Character> stackBracket;

  /**
   * Constructs the object.
   *
   * @param      s     { parameter_description }
   */
  Balparen(final String s) {
    parenthesis = s.toCharArray();
    stackBracket = new Stack1();
  }

  /**
   * Determines if balanced.
   *
   * @return     True if balanced, False otherwise.
   */
  public boolean isBalanced() {

    for (char c : parenthesis) {

      if (c == '[' || c == '(' || c == '{') {
        stackBracket.push(c);
      } else if (c == ']') {

        if (stackBracket.isEmpty() || stackBracket.pop() != '[') {
          return false;
        }
      } else if (c == ')') {

        if (stackBracket.isEmpty() || stackBracket.pop() != '(') {
          return false;
        }
      } else if (c == '}') {
        if (stackBracket.isEmpty() || stackBracket.pop() != '{') {
          return false;
        }
      }

    }
    return stackBracket.isEmpty();
  }

}

/**
 * Class for Solution.
 */
public final class Solution {

  /**
   * Constructs the object.
   */
  private Solution() {
    /**
     * Unused constructor.
     */
  }

  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);
    int noOFLines = Integer.parseInt(sc.nextLine());
    // System.out.println(noOFLines);

    while (sc.hasNext()) {
      String input = new String(sc.nextLine());
      // System.out.println(input);
      Balparen checkThisString = new Balparen(input);
      if (checkThisString.isBalanced()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

}

