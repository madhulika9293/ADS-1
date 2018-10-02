import java.util.Arrays;

/**
 * Class for team object.
 * We use comparable interface to implement sort algortihms.
 */
public class Team implements Comparable<Team> {
	/**
	 * team name.
	 */
	String teamName;
	/**
	 * wins for the team.
	 */
	int wins;
	/**
	 * losses for the team.
	 */
	int losses;
	/**
	 * draws for the team.
	 */
	int draws;

	/**
	 * Constructs the object.
	 *
	 * @param      tN    The t n
	 * @param      w     wins
	 * @param      l     losses
	 * @param      d     draws.
	 */
	Team(final String tN, final int w, final int l, final int d) {
		teamName = tN;
		wins = w;
		losses = l;
		draws = d;
	}

	/**
	 * Compares two objects of this class.
	 * Complexity Analysis: O(1).
	 *
	 * @param      other  The other
	 *
	 * @return     int: 1 if greater, 0 if equal & -1 if lesser.
	 */
	public int compareTo (Team other) {
		if (this.wins > other.wins) return 1;
		if (this.wins < other.wins) return -1;
		if (this.losses < other.losses) return 1;
		if (this.losses > other.losses) return -1;
		if (this.draws > other.draws) return 1;
		if (this.draws < other.draws) return -1;
		else return 0;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return teamName;
	}

}

/**
 * Class for insertion sort of teams.
 */
class InsertionSortTeam {
	/**
	 * To check if the object is greater.
	 *
	 * @param      a     team 1
	 * @param      b     team 2
	 *
	 * @return     returns true if team 1 is greater than
	 * team 2 on the leader board.
	 */
	static boolean more (Comparable a, Comparable b) {
		return a.compareTo(b) > 0;
	}

	/**
	 * Swaps 2 objects in the array of objects.
	 *
	 * @param      a     Array of objects.
	 * @param      i     Object 1.
	 * @param      j     Object 2.
	 */
	static void swap ( Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * Sorts the array of objects using Insertion Sort.
	 *
	 * Best Case: N-1 compares and 0 exchanges.
	 *
	 * Average Case: N^2/4 compares and N^2/4 exchanges.
	 *
	 * Worst Case: N^2/2 compares and N^2/2 exchanges.
	 *
	 * @param      arr   The array of objects.
	 * @param      size  The number of objects in the array.
	 */
	static void sort(Comparable[] arr, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j > 0; j--) {
				if (more(arr[j], arr[j - 1])) {
					swap(arr, j, j - 1);
				}
			}
			// System.out.println(Arrays.toString(arr));
		}
	}
}
