/**
 * Class for student.
 */
class Student implements Comparable<Student> {
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
    Student(final int num, final String nm, final double mrks) {
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


    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.name;
    }

    /**
     * Compares.
     *
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Student other) {
        if (this.marks > other.marks) {
            return 1;
        }
        if (this.marks < other.marks) {
            return -1;
        }
        if (this.name.compareTo(other.name) > 0) {
            return 1;
        }
        if (this.name.compareTo(other.name) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

