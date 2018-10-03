import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// unused constructor
	}
	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String[] inputs = scan.nextLine().split(",");
			// Integer[] inpInt = new Integer[inputs.length];
			// for (int i = 0; i < inputs.length; i++) {
				// inpInt = Integer.parseInt(inputs[i]);
				MergeSort.sort(inputs);
				System.out.println(Arrays.toString(inputs));
			// }
		}
	}
}
