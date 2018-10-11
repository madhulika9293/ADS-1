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

  /**
   * Assigns seats to the remaining students.
   *
   * @param      arr     The arr
   * @param      toArr   To arr
   * @param      insert  The insert
   * @param      n       { parameter_description }
   * @param      strt    The strt
   */
  public static void add(final Student[] arr,
                         final Student[] toArr,
                         final int insert, final int n,
                         final int strt) {
    int check = 0;
    int at = insert;
    for (int j = strt; j < arr.length; j++) {
      if (!Arrays.asList(toArr).contains(arr[j])) {
        toArr[at] = arr[j];
        at += 1;
        check += 1;
      }

      if (check == n) {
        break;
      }
    }
  }

  /**
   * Fills the seats with desrving students.
   *
   * @param      stus   The stus
   * @param      totV   The total v
   * @param      unres  The unres
   * @param      bc     BC seats #.
   * @param      sc     SC seats #.
   * @param      st     ST seats #.
   *
   * @return     { description_of_the_return_value }
   */
  public static Student[] seatsFilled(final Student[] stus,
                                      final int totV,
                                      final int unres,
                                      final int bc, final int sc,
                                      final int st) {

    Student[] seats = new Student[totV];
    for (int i = 0; i < unres; i++) {
      seats[i] = stus[i];
    }
    int filled = unres;
    int totSz = stus.length;

    for (int i = filled; bc > 0 && i < totSz; i++) {
      if (filled < unres + bc && stus[i].getResCat().equals("BC")
          && filled <= totV) {
        seats[filled] = stus[i];
        filled += 1;
      }
    }

    int tBc = filled - unres;

    // System.out.println(filled);
    // System.out.println(Arrays.toString(seats));

    for (int i = unres; st > 0 && i < totSz; i++) {
      if (stus[i].getResCat().equals("ST")
          && filled <= totV) {
        seats[filled] = stus[i];
        filled += 1;
        if (filled == unres + tBc + st) {
          break;
        }
      }
    }

    // System.out.println(filled);
    // System.out.println(Arrays.toString(seats));

    for (int i = unres; sc > 0 && i < totSz; i++) {
      if (stus[i].getResCat().equals("SC")
          && filled <= totV) {
        seats[filled] = stus[i];
        filled += 1;
        if (filled == unres + tBc + st + sc) {
          break;
        }
      }
    }

    if (filled < totV) {
      int toBeFilled = totV - filled;
      add(stus, seats, filled, toBeFilled, unres);
    }
    // System.out.println(Arrays.toString(seats));
    HeapSort.sort(seats);
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

    int num = studentsQual;
    int size = 0;
    Student[] students = new Student[num];

    for (int i = 0; i < num; i++) {
      Student tempStu = new Student(scan.nextLine());
      // System.out.println(tempStu);
      students[size++] = tempStu;
    }
    scan.close();

    HeapSort.sort(students);
    for (int i = 0; i < num; i++) {
      System.out.println(students[i]);
    }

    System.out.println();

    Student[] filledSeats = seatsFilled(students,
                                        totVac, unResVac,
                                        nBCVac, nSCVac, nSTVac);
    for (int i = 0; i < totVac; i++) {
      System.out.println(filledSeats[i]);
    }
  }
}
