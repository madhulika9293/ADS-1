import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for sorted.
 */
class Sorted {
  /**
   * Constructs the object.
   */
  private Sorted() {
    // unused
  }

  /**
   * Adds the given arrays into a single array.
   *
   * @param      n1    The n 1
   * @param      n2    The n 2
   *
   * @return     String representation of the added arrays.
   */
  public static String addArr(final int[] n1, final int[] n2) {
    int len = n1.length + n2.length;

    int[] res = new int[len];
    int size = 0;
    int i = 0;
    int j = 0;

    while (size < len) {
      if (i < n1.length && j < n2.length && n1[i] <= n2[j]) {
        System.out.println(n1[i]);
        System.out.println(n2[j]);
        System.out.println(i < n1.length);
        System.out.println(j < n2.length);
        System.out.println(i < n1.length && j < n2.length && n1[i] <= n2[j]);
        res[size] = n1[i];
        size += 1;
        i += 1;
      }
      if (i < n1.length && j < n2.length && n1[i] > n2[j]) {
        res[size] = n2[j];
        size += 1;
        j += 1;
      }
    }
    return Arrays.toString(res);
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

    if (num1 != 0) {
      for (int i = 0; i < a1.length; i++) {
        // String temp = a1[i];
        arr1[i] = Integer.parseInt(a1[i]);
      }
    }

    if (num2 != 0) {
      for (int i = 0; i < a2.length; i++) {
        // String temp = a2[i];
        arr2[i] = Integer.parseInt(a2[i]);
      }
    }

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Sorted.addArr(arr1, arr2));
  }
}

