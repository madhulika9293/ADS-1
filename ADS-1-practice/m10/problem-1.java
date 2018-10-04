/**
 * Class for problem 1.
 */
class problem1 {
	/**
	 * Calculates Factorial.
	 *
	 * @param      n     Non-negative number input.
	 *
	 * @return     factorial of the given number.
	 */
	public static int factorial (int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}