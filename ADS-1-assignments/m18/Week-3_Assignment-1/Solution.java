import java.util.Scanner;

/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * Class variable for company name.
	 */
	private String company;
	/**
	 * Class variable for change in stock by hour.
	 */
	private double change;

	/**
	 * Constructs the object.
	 *
	 * @param      cmp   The company
	 * @param      chg   The change
	 */
	Stock(final String cmp, final double chg) {
		this.company = cmp;
		this.change = chg;
	}

	/**
	 * Gets the company.
	 *
	 * @return     The company.
	 */
	public String getComp() {
		return company;
	}

	/**
	 * Gets the change.
	 *
	 * @return     The change.
	 */
	public double getChange() {
		return change;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return company + " " + change;
	}

	/**
	 * Compares two stocks.
	 *
	 * @param      that  The that
	 *
	 * @return     Integer value to compare.
	 */
	public int compareTo(Stock that) {
		if (this.change > that.getChange()) {
			return 1;
		}
		if (this.change < that.getChange()) {
			return -1;
		}
		if (this.company.compareTo(that.getComp()) > 0) {
			return 1;
		}
		if (this.company.compareTo(that.getComp()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}

/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// unused
	}

	/**
	 * Main method - Takes Inputs, prints out Outputs.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		int stockSize = Integer.parseInt(scan.nextLine());

		MinPQ<Stock> hr1Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr1Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0], Double.parseDouble(inputs[1]));
			hr1Max.insert(temp);
			hr1Min.insert(temp);
		}

		System.out.println("\n");
		hr1Max.print5();
		System.out.println("\n");
		hr1Min.print5();
	}
}
