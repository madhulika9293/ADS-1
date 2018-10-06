/**
 * Class for storing student information.
 */
class Student implements Comparable<Student> {
	/**
	 * Name of the student.
	 */
	String name;
	/**
	 * Date of birth.
	 */
	String dob;
	/**
	 * Marks obtained in Subject 1.
	 */
	int sub1Marks;
	/**
	 * Marks obtained in Subject 2.
	 */
	int sub2Marks;
	/**
	 * Marks obtained in Subject 3.
	 */
	int sub3Marks;
	/**
	 * Total marks obtained.
	 */
	int totMarks;
	/**
	 * Reservation Category of the Student.
	 */
	String resCat;
	/**
	 * Year born.
	 */
	int dobYear;
	/**
	 * Month born.
	 */
	int dobMonth;
	/**
	 * Day born.
	 */
	int dobDay;
	/**
	 * Constructs the object.
	 *
	 * @param      input  The input
	 */
	Student(final String input) {
		String[] inp = input.split(",");
		name = inp[0];
		dob = inp[1];
		dobYear = Integer.parseInt(dob.substring(6, 10));
		dobMonth = Integer.parseInt(dob.substring(3, 5));
		// System.out.println(dobMonth);
		dobDay = Integer.parseInt(dob.substring(0, 2));
		sub1Marks = Integer.parseInt(inp[2]);
		sub2Marks = Integer.parseInt(inp[3]);
		sub3Marks = Integer.parseInt(inp[4]);
		totMarks = Integer.parseInt(inp[5]);
		resCat = inp[6];
	}

	/**
	 * Compares two Students based on the merit criteria.
	 *
	 * @param      other  The other Student
	 *
	 * @return     1, 0 or -1 depending on comparison.
	 */
	public int compareTo (Student other) {
		if (this.totMarks > other.totMarks) return 1;
		if (this.totMarks < other.totMarks) return -1;
		if (this.sub3Marks > other.sub3Marks) return 1;
		if (this.sub3Marks < other.sub3Marks) return -1;
		if (this.sub2Marks > other.sub2Marks) return 1;
		if (this.sub2Marks < other.sub2Marks) return -1;
		if (this.dobYear > other.dobYear) return 1;
		if (this.dobYear < other.dobYear) return -1;
		if (this.dobMonth > other.dobMonth) return 1;
		if (this.dobMonth < other.dobMonth) return -1;
		if (this.dobDay > other.dobDay) return 1;
		if (this.dobDay < other.dobDay) return -1;
		return 0;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return name + "," + totMarks + "," + resCat;
	}
}

