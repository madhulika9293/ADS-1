/**
 * Class for problem 2.
 */
class problem2 {
	/**
	 * Inserts a star in between two repeated characters in the given string.
	 *
	 * @param      s     Input String.
	 *
	 * @return     A string with a '*' in between its repeated characters.
	 */
	public static String sameStar(String s) {
		int n = s.length();
		if (n < 2) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + sameStar(s.substring(1));
		}
		return s.charAt(0) + sameStar(s.substring(1));
	}

	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		System.out.println(sameStar("hello"));
		System.out.println(sameStar("xxyy"));
		System.out.println(sameStar("aaaa"));
	}
}