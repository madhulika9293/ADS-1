import java.util.Arrays;

public class MergeSort {

  static int cutoff = 7;

  public static boolean less(Comparable x, Comparable y) {
    return x.compareTo(y) < 0;
  }

  public static boolean isSorted(Comparable[] a, int l, int h) {
    for (int i = l + 1; i <= h; i++) {
      if (less(a[i], a[i - 1])) return false;
    }
    return true;
  }

  public static void merge(Comparable[] a, Comparable[] aux,
                           int lo, int mid, int hi) {

    int i = lo;
    int j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      if (i > mid) {
        aux[k] = a[j++];
      } else if (j > hi) {
        aux[k] = a[i++];
      } else if (less(a[j], a[i])) {
        aux[k] = a[j++];
      } else {
        aux[k] = a[i++];
      }
    }
  }

  // top down sort
  public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

    if (hi <= (lo + cutoff)) {
      InsertionSort.sort(aux, lo, hi);
      System.out.println("Insertion sort method invoked...");
      return;
    } else {

      int mid = lo + (hi - lo) / 2;
      sort(aux, a, lo, mid);
      sort(aux, a, mid + 1, hi);

      if (!less(a[mid + 1], a[mid])) {
        for (int i = lo; i <= hi; i++) {
          aux[i] = a[i];
        }
        // System.arraycopy(a, lo, aux, lo, hi - lo + 1);
        System.out.println(
          "Array is already sorted. So, skipped the call to merge...");
        return;
      }
      merge(a, aux, lo, mid, hi);
    }
  }

  // top down sort
  public static void sort(Comparable[] a) {
    Comparable[] aux = a.clone();
    sort(a, aux, 0, a.length - 1);
  }

  public static void sortBU(Comparable[] a) {
    Comparable[] aux = new Comparable[a.length];
    for (int size = 1; size < a.length; size *= 2) {
      for (int lo = 0; lo < a.length - size; lo += size * 2) {
        merge(a, aux, lo, lo + size - 1,
              Math.min(lo + size * 2 - 1, a.length - 1));
      }
    }
  }

}
