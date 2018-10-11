/**
 * Class for heap.
 */
public class HeapSort {

    /**
     * Constructs the object.
     */
    private HeapSort() { }

    /**
     * Sorts the given array using heapsort.
     *
     * @param      pq    Input array of Student objects.
     */
    public static void sort(final Student[] pq) {
        int n = pq.length;
        for (int k = n / 2; k >= 1; k--)
            sink(pq, k, n);
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

    /***************************************************************************
     * Helper functions to restore the heap invariant.
     ***************************************************************************/

    /**
     * To sink the array with an element.
     *
     * @param      pq    Input array.
     * @param      k     Index.
     * @param      n     Size of the array.
     */
    private static void sink(Student[] pq, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && more(pq, j, j + 1)) j++;
            if (!more(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    /***************************************************************************
     * Helper functions for comparisons and swaps.
     * Indices are "off-by-one" to support 1-based indexing.
     ***************************************************************************/
    /**
     * Compares two objects.
     *
     * @param      pq    Input array.
     * @param      i     Object 1.
     * @param      j     Object 2.
     *
     * @return     true if more, false otherwise.
     */
    private static boolean more(Student[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) > 0;
    }

    /**
     * Exchanges the elements.
     *
     * @param      pq    The input array.
     * @param      i     Object 1.
     * @param      j     Object 2.
     */
    private static void exch(Student[] pq, int i, int j) {
        Student swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

}
