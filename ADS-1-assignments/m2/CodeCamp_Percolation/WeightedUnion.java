import java.util.Arrays;
import java.util.Scanner;

class WeightedUnion {
	/**
	 * Array for the connections.
	 */
	private int[] id;
	/**
	 * Number of objects rooted in the array at i.
	 */
	private int[] sz;
	/**
	 * Constructs the object.
	 *
	 * @param      n     Total number of elements in the tree.
	 */
	WeightedUnion(int n) {
		id = new int[n];
		sz = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	/**
	 * Searches for the first match.
	 *
	 * @param      p     Element in the array.
	 *
	 * @return     root of p.
	 */
	public int find(int p) {
		while (p != id[p]) {
			// id[p] = id[id[p]];
			p = id[p];
		}
		return p;
	}

	/**
	 * checks if connected.
	 *
	 * @param      p     { parameter_description }
	 * @param      q     The quarter
	 *
	 * @return     { description_of_the_return_value }
	 */
	public boolean connected(final int p, final int q) {
		return find(p) == find(q);
	}

	public void union(final int p, final int q) {
		int i = find(p);
		int j = find(q);
		if (i == j) return;

		// make smaller root point to larger one
		if   (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
		else                 { id[j] = i; sz[i] += sz[j]; }
	}
}
