/**
 * Scanner package import.
 */
import java.util.Scanner;
/**
 * Arrays package import.
 */
import java.util.Arrays;

/**
 * Class for Solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// unused constructor
	}

	/**
	 * Main function
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int numInp = scan.nextInt();
		int size = 0;
		int[] inpArr = new int[numInp];
		for (int i = 0; i < numInp; i++) {
			inpArr[size] = scan.nextInt();
			size += 1;
		}

		int count = 0;
		Arrays.sort(inpArr);
		for (int i = 0; i < inpArr.length - 1; i++) {
			if (inpArr[i] == inpArr[i + 1]) {
				count += 1;
			}
		}

		System.out.println("The number of equal pairs in the input are: "
		                   + (count * (count + 1)) / 2);
	}
}

