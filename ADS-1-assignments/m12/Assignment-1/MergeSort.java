
/**
 * Class for merge sort : Descending order.
 */
public final class MergeSort {
  /**
   * Constructs the object.
   */
  private MergeSort() {
    // unused
  }

  /**
   * More of the 2 objects.
   *
   * @param      x     obj1.
   * @param      y     obj2.
   *
   * @return     true or false.
   */
  public static boolean more(final Comparable x, final Comparable y) {
    return x.compareTo(y) > 0;
  }

  /**
   * Merges the 2 arrays.
   *
   * @param      a     initial array.
   * @param      aux   The auxiliary
   * @param      lo    The lower
   * @param      mid   The middle
   * @param      hi    The higher
   */
  public static void merge(final Comparable[] a,
                           final Comparable[] aux,
                           final int lo,
                           final int mid,
                           final int hi) {

    for (int i = lo; i <= hi; i++) {
      aux[i] = a[i];
    }

    int i = lo;
    int j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      if (i > mid) {
        a[k] = aux[j++];
      } else if (j > hi) {
        a[k] = aux[i++];
      } else if (more(aux[j], aux[i])) {
        a[k] = aux[j++];
      } else {
        a[k] = aux[i++];
      }
    }
  }

  // top down sort

  /**
   * Top down sort - mergesort.
   *
   * @param      a     array.
   * @param      aux   The auxiliary
   * @param      lo    The lower
   * @param      hi    The higher
   */
  public static void sort(final Comparable[] a,
                          final Comparable[] aux,
                          final int lo,
                          final int hi) {
    if (hi <= lo) {
      return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(a, aux, lo, mid);
    sort(a, aux, mid + 1, hi);
    merge(a, aux, lo, mid, hi);
  }

  /**
   * Overloaded sort function.
   *
   * @param      a     The array.
   */
  public static void sort(final Comparable[] a) {
    Comparable[] aux = new Comparable[a.length];
    sort(a, aux, 0, a.length - 1);
  }

}
