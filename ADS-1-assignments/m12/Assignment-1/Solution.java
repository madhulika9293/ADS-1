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
		int sz = unres;

		for (int i = sz; i < totV - 1; i++) {
			// System.out.println(stus[i].resCat);
			if (bc > 0 && sz <= unres + bc && stus[i].resCat.equals("BC")) {
				seats[sz++] = stus[i];
				// System.out.println(Arrays.toString(seats));
			}
		}

		for (int i = sz; i < totV - 1; i++) {
			System.out.println(st > 0 && sz <= unres + bc + st && stus[i].resCat.equals("ST"));
			if (st > 0 && sz <= unres + bc + st && stus[i].resCat.equals("ST")) {
				seats[sz++] = stus[i];
			}
		}

		for (int i = sz; i < totV - 1; i++) {
			if (sc > 0 && sz <= unres + bc + st + sc && stus[i].resCat.equals("SC")) {
				seats[sz++] = stus[i];
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
