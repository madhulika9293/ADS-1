/**
 * Class for storing student information.
 */
class Student implements Comparable<Student> {
  /**
   * Name of the student.
   */
  private String name;
  /**
   * Date of birth.
   */
  private String dob;
  /**
   * Marks obtained in Subject 1.
   */
  private int sub1Marks;
  /**
   * Marks obtained in Subject 2.
   */
  private int sub2Marks;
  /**
   * Marks obtained in Subject 3.
   */
  private int sub3Marks;
  /**
   * Total marks obtained.
   */
  private int totMarks;
  /**
   * Reservation Category of the Student.
   */
  private String resCat;
  /**
   * Year born.
   */
  private int dobYear;
  /**
   * Month born.
   */
  private int dobMonth;
  /**
   * Day born.
   */
  private int dobDay;
  /**
   * Constructs the object.
   *
   * @param      input  The input
   */
  Student(final String input) {

    final int three = 3;
    final int four = 4;
    final int five = 5;
    final int six = 6;
    final int ten = 10;

    String[] inp = input.split(",");
    name = inp[0];
    dob = inp[1];
    dobYear = Integer.parseInt(dob.substring(six, ten));
    dobMonth = Integer.parseInt(dob.substring(three, five));
    // System.out.println(dobMonth);
    dobDay = Integer.parseInt(dob.substring(0, 2));
    sub1Marks = Integer.parseInt(inp[2]);
    sub2Marks = Integer.parseInt(inp[three]);
    sub3Marks = Integer.parseInt(inp[four]);
    totMarks = Integer.parseInt(inp[five]);
    resCat = inp[six];
  }

  /**
   * Compares two Students based on the merit criteria.
   *
   * @param      other  The other Student
   *
   * @return     1, 0 or -1 depending on comparison.
   */
  public int compareTo(final Student other) {
    if (this.totMarks > other.totMarks) { return 1;}
    if (this.totMarks < other.totMarks) {return -1; }
    if (this.sub3Marks > other.sub3Marks) {return 1; }
    if (this.sub3Marks < other.sub3Marks) {return -1; }
    if (this.sub2Marks > other.sub2Marks) {return 1; }
    if (this.sub2Marks < other.sub2Marks) {return -1; }
    if (this.dobYear > other.dobYear) {return 1; }
    if (this.dobYear < other.dobYear) {return -1; }
    if (this.dobMonth > other.dobMonth) {return 1; }
    if (this.dobMonth < other.dobMonth) {return -1; }
    if (this.dobDay > other.dobDay) {return 1; }
    if (this.dobDay < other.dobDay) {return -1; }
    return 0;
  }

  /**
   * Returns a string representation of the object.
   *
   * @return     String representation of the object.
   */
  public String toString() {
    return this.name + "," + this.totMarks + "," + this.resCat;
  }

  /**
   * Gets the category of the student.
   *
   * @return     category.
   */
  public String getResCat() {
    return resCat;
  }

}

