import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for three sum.
 */
class ThreeSum {
  /**
   * Constructs the object.
   */
  private ThreeSum() {
    // unused constructor
  }

  /**
   * Counts the number of triplets whose sum is zero in the given array.
   *
   * @param      arr   The array.
   *
   * @return     Number of triplets.
   */
  public static int countTriplets(final int[] arr) {
    int count = 0;
    Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
    for (int k = 0; k < arr.length; k++) {
      int i = 0;
      int j = arr.length - 1;
      int element = arr[k];
      while (i != k && j != k && i < j) {
        int sum = arr[i] + arr[j];
        if (sum + element > 0) {
          j -= 1;
        } else if (sum + element < 0) {
          i += 1;
        } else {
          count += 1;
          i++;
        }
      }
    }
    return count;
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
    // unused constructor
  }
  /**
   * Main function: Reads in the input and prints out the # of triplets.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int[] inpArr = new int[num];
    for (int i = 0; i < num; i++) {
      inpArr[i] = scan.nextInt();
    }
    // System.out.println(Arrays.toString(inpArr));
    System.out.println(ThreeSum.countTriplets(inpArr));
  }
}
