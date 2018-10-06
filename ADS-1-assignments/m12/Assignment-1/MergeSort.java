import java.util.Arrays;

/**
 * Class for merge sort : Descending order.
 */
public class MergeSort {

	public static boolean more(Comparable x, Comparable y) {
		return x.compareTo(y) > 0;
	}

	public static void merge(Comparable[] a, Comparable[] aux,
	                         int lo, int mid, int hi) {

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
	public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

	// top down sort
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

	// bottomUp sort
	public static void sortBU(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		for (int size = 1; size < a.length; size *= 2) {
			for (int lo = 0; lo < a.length - size; lo += size * 2) {
				merge(a, aux, lo, lo + size - 1,
				      Math.min(lo + size * 2 - 1, a.length - 1));
			}
		}
	}

	// public static void main(String[] args) {
	// 	// String[] arr = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
	// 	Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
	// 	             16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
	// 	             30, 31, 32, 33, 34, 35, 36, 37, 38, 39
	// 	            };
	// 	System.out.println("----Top Down Sort----");
	// 	sort(arr);
	// 	// System.out.println("----Bottom Up Sort----");
	// 	// sortBU(arr);
	// 	System.out.println(Arrays.toString(arr));

	// }
}
