import java.util.Scanner;

class CubeSum implements Comparable<CubeSum> {
  private final int sum;
  private final int i;
  private final int j;

  public CubeSum(int i, int j) {
    this.sum = i * i * i + j * j * j;
    this.i = i;
    this.j = j;
  }

  public int compareTo(CubeSum that) {
    if (this.sum < that.sum) return -1;
    if (this.sum > that.sum) return +1;
    return 0;
  }

  public String toString() {
    return sum + " = " + i + "^3" + " + " + j + "^3";
  }

  public int sum() {
    return sum;
  }

  public int geti() {
    return i;
  }

  public int getj() {
    return j;
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
  static Scanner scan = new Scanner(System.in);
  /**
   * Main method.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    int num = scan.nextInt();
    int mWays = scan.nextInt();

    MinPQ<CubeSum> pq = new MinPQ<CubeSum>();

    for (int i = 1; i <= 550; i++) {
      pq.insert(new CubeSum(i, i));
    }

        CubeSum prev = new CubeSum(0, 0);
        long sum = 0;
        // for (k < n; k++) {
        int p = 1;
        int k = 0;
      while (!pq.isEmpty()) {
        CubeSum c = pq.delMin();
          if (prev.sum() == c.sum()) {
            p++;
            if (p == mWays)
          {
            sum = c.sum();

            if (++k == num) break;
            }
          }
          else {
            p = 1;
          }
          prev = c;
          if (c.getj() < 550)
              pq.insert(new CubeSum(c.geti(), c.getj() + 1));
          // }
        }
        System.out.println(sum);

  }
}

