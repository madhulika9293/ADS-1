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

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    String[] a1 = scan.nextLine().split(",");
    String[] a2 = scan.nextLine().split(",");

    int[] arr1 = new int[num1];
    int[] arr2 = new int[num2];

    for (int i = 0; i < num1; i++) {
      String temp = a1[i];
      arr1[i] = Integer.parseInt(temp);
    }

    for (int i = 0; i < num2; i++) {
      String temp = a2[i];
      arr2[i] = Integer.parseInt(temp);
    }

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }
}