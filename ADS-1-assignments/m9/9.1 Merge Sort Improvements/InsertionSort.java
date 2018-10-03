import java.util.Arrays;

public class InsertionSort {
	public static boolean less (Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static boolean more (Comparable a, Comparable b) {
		return a.compareTo(b) > 0;
	}

	public static void swap (Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void sort(Comparable[] a, int l, int h) {
		if (h <= l) {
			return;
		}
		for (int i = l; i <= h ; i++) {
			for (int j = i; j > l; j--) {
				if (less(a[j], a[j - 1])) {
					swap(a, j, j - 1);
				}
			}
			// System.out.println("Step " + (i + 1) + ": "
			// + Arrays.toString(a).replace(",", "").replace("[", "").replace("]", "") + "\n");
			// System.out.println(Arrays.toString(a));
		}
	}

	// public static void main(String[] args) {
	// 	Integer[] arr = {3, 6, 4, 2, 1, 0};
	// 	// String[] arr = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
	// 	sort(arr, 1, 5);
	// 	System.out.println(Arrays.toString(arr));
	// }
}
