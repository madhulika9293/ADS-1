import java.util.Scanner;
import java.util.Arrays;

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
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num1 = Integer.parseInt(scan.nextLine());
    int num2 = Integer.parseInt(scan.nextLine());

    String[] a1 = scan.nextLine().split(",");
    String[] a2 = scan.nextLine().split(",");

    int[] arr1 = new int[num1];
    int[] arr2 = new int[num2];

    for (int i = 0; i < a1.length; i++) {
      // String temp = a1[i];
      arr1[i] = Integer.parseInt(a1[i]);
    }

    for (int i = 0; i < a2.length; i++) {
      // String temp = a2[i];
      arr2[i] = Integer.parseInt(a2[i]);
    }

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }
}