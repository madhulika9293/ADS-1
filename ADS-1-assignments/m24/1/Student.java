/**
 * Class for student.
 */
class Student {
	/**
	 * Roll number.
	 */
	private int rollNumber;
	/**
	 * Name.
	 */
	private String name;
	/**
	 * Marks.
	 */
	private double marks;

	/**
	 * Constructs the object.
	 *
	 * @param      num   The roll number
	 * @param      nm    Name
	 * @param      mrks  The marks
	 */
	public Student(final int num, final String nm, final double mrks) {
		this.rollNumber = num;
		this.name = nm;
		this.marks = mrks;
	}

	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the marks.
	 *
	 * @return     The marks.
	 */
	public double getMarks() {
		return this.marks;
	}
}

