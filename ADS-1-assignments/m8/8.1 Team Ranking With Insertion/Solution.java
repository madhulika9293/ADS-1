import java.util.Arrays;
import java.util.Scanner;

public final class Solution {

	private Solution() {
		// unused constructor
	}

	public static String leaderBoard(final Team[] tms, final int sz) {
		InsertionSortTeam.sort(tms, sz);

		String out = "";
		for (int i = 0; i < sz; i++) {
			out += tms[i].toString();
			out += ",";
		}
		out = out.substring(0, out.length() - 1);
		return out;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Team[] teams = new Team[10];
		int size = 0;

		while (scan.hasNext()) {
			String[] inp = scan.nextLine().split(",");
			Team temp = new Team(inp[0],
			                     Integer.parseInt(inp[1]),
			                     Integer.parseInt(inp[2]),
			                     Integer.parseInt(inp[3]));
			teams[size] = temp;
			size += 1;
		}
		scan.close();
		System.out.println(leaderBoard(teams, size));
	}
}
