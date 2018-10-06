import java.util.Scanner;
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

	public static Student[] seatsFilled (final Student[] stus,
	                                     final int totV,
	                                     final int unres,
	                                     final int bc, final int sc,
	                                     final int st) {

		Student[] seats = new Student[totV];
		for (int i = 0; i < unres; i++) seats[i] = stus[i];
		int filled = unres;
		int totSz = stus.length;

		for (int i = filled; bc > 0 && i < totSz; i++) {
			if (filled <= unres + bc && stus[i].resCat.equals("BC")
			        && filled <= totV) {
				seats[filled] = stus[i];
				filled += 1;
			}
		}

		// System.out.println(filled);

		for (int i = filled; st > 0 && i < totSz; i++) {
			if (filled < unres + bc + st && stus[i].resCat.equals("ST")
			        && filled <= totV) {
				seats[filled] = stus[i];
				filled += 1;

			}
		}
		// System.out.println(filled);

		for (int i = filled; sc > 0 && i < totSz; i++) {
			if (filled < unres + bc + st + sc && stus[i].resCat.equals("SC")
			        && filled <= totV) {
				seats[filled] = stus[i];
				filled += 1;
			}
		}

		return seats;
	}
	/**
	 * Main function - reads in inputs and prints the output to console.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		int studentsQual = Integer.parseInt(scan.nextLine());
		int totVac = Integer.parseInt(scan.nextLine());
		int unResVac = Integer.parseInt(scan.nextLine());
		int nBCVac = Integer.parseInt(scan.nextLine());
		int nSCVac = Integer.parseInt(scan.nextLine());
		int nSTVac = Integer.parseInt(scan.nextLine());

		int N = studentsQual;
		int size = 0;
		Student[] students = new Student[N];

		for (int i = 0; i < N; i++) {
			Student tempStu = new Student(scan.nextLine());
			// System.out.println(tempStu);
			students[size++] = tempStu;
		}
		scan.close();

		MergeSort.sort(students);
		for (int i = 0; i < N; i++) System.out.println(students[i]);

		System.out.println();

		Student[] filledSeats = seatsFilled(students,
		                                    totVac, unResVac,
		                                    nBCVac, nSCVac, nSTVac);
		for (int i = 0; i < totVac; i++) System.out.println(filledSeats[i]);
	}
}
