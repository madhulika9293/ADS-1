import java.util.Arrays;

public class Team implements Comparable<Team> {
	String teamName;
	int wins;
	int losses;
	int draws;

	Team(final String tN, final int w, final int l, final int d) {
		teamName = tN;
		wins = w;
		losses = l;
		draws = d;
	}

	public int compareTo (Team other) {
		if (this.wins > other.wins) return 1;
		if (this.wins < other.wins) return -1;
		if (this.losses < other.losses) return 1;
		if (this.losses > other.losses) return -1;
		if (this.draws > other.draws) return 1;
		if (this.draws < other.draws) return -1;
		else return 0;
	}

	public String toString() {
		return teamName;
	}

}

class InsertionSortTeam {
	static boolean more (Comparable a, Comparable b) {
		return a.compareTo(b) > 0;
	}

	static void swap ( Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

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
