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
		}
	}

	// public static void main(String[] args) {
	// 	String[] arr = {"22", "96", "23", "433", "33", "307", "162", "221"};
	// 	// String[] arr = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
	// 	sort(arr, 0, 7);
	// 	System.out.println(Arrays.toString(arr));
	// }
}
