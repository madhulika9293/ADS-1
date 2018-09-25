import java.util.Arrays;
import java.util.Scanner;



class Percolation {
	// create n-by-n grid, with all sites blocked

	/**
	 * grid for simulation.
	 */
	private boolean[][] grid;
	/**
	 * Size of the grid.
	 */
	private int n;
	/**
	 * number of open sites.
	 */
	private int count;
	/**
	 * top node.
	 */
	private int top;
	/**
	 * bottom node.
	 */
	private int bottom;
	/**
	 * connection array.
	 */
	private WeightedUnion percCheck;

	/**
	 * Constructs the object.
	 *
	 * @param      num     Size of the grid.
	 */
	public Percolation(int num) {
		grid = new boolean[num][num];
		count = 0;
		top = 0;
		bottom = (num * num) + 1;
		percCheck = new WeightedUnion(num * num + 2);
		n = num;
	}

	public int getNum(final int row, final int col) {
		return (row - 1) * n + col;
	}
	// open site (row, col) if it is not open already
	public void open(int row, int col) {
		if (isOpen(row, col)) {
			return;
		} else {
			grid[row - 1][col - 1] = true;
			count += 1;
		}
		if (row == 1) {
			percCheck.union(getNum(row, col), top);
		}
		if (row == n) {
			percCheck.union(getNum(row, col), bottom);
		}
		if (isOpen(row, col - 1) && col > 1) {
			percCheck.union(getNum(row, col), getNum(row, col - 1));
		}
		if (isOpen(row, col + 1) && col < n) {
			percCheck.union(getNum(row, col), getNum(row, col + 1));
		}
		if (isOpen(row - 1, col) && row > 1) {
			percCheck.union(getNum(row, col), getNum(row - 1, col));
		}
		if (isOpen(row + 1, col) && row < n) {
			percCheck.union(getNum(row, col), getNum(row + 1, col));
		}
	}

	public boolean isOpen(int row, int col) {
		// is site (row, col) open?
		return grid[row - 1][col - 1];
	}
	// public boolean isFull(int row, int col)  // is site (row, col) full?
	public     int numberOfOpenSites() {
		// number of open sites
		return count;
	}
	public boolean percolates() {
		// does the system percolate?
		return percCheck.connected(top, bottom);
	}
}


// You can implement the above API to solve the problem

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Percolation perc = new Percolation(num);
		// System.out.println(Arrays.deepToString(perc));
		while (scan.hasNext()) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			perc.open(p, q);
		}
		System.out.println(perc.percolates());
	}
}

