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
	public int compareTo(final Stock that) {
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

		// hour 1
		MinPQ<Stock> hr1Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr1Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr1Max.insert(temp);
			hr1Min.insert(temp);
		}

		hr1Max.print5();
		hr1Min.print5();
		

		// hour 2
		MinPQ<Stock> hr2Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr2Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr2Max.insert(temp);
			hr2Min.insert(temp);
		}

		hr2Max.print5();
		hr2Min.print5();

		// hour 3
		MinPQ<Stock> hr3Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr3Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr3Max.insert(temp);
			hr3Min.insert(temp);
		}

		hr3Max.print5();
		hr3Min.print5();

		// hour 4
		MinPQ<Stock> hr4Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr4Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr4Max.insert(temp);
			hr4Min.insert(temp);
		}

		hr4Max.print5();
		hr4Min.print5();

		// hour 5
		MinPQ<Stock> hr5Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr5Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr5Max.insert(temp);
			hr5Min.insert(temp);
		}

		hr5Max.print5();
		hr5Min.print5();		

		// hour 6
		MinPQ<Stock> hr6Min = new MinPQ<Stock>();
		MaxPQ<Stock> hr6Max = new MaxPQ<Stock>();

		for (int i = 0; i < stockSize; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			hr6Max.insert(temp);
			hr6Min.insert(temp);
		}

		hr6Max.print5();
		hr6Min.print5();		

	}
}
