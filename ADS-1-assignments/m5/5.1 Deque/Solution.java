import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Reads the inputs and displays the outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque l = new Deque();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
            case "pushLeft":
                l.pushLeft(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
            case "pushRight":
                l.pushRight(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
            case "popLeft":
                if (l.popLeft() != null) {
                    System.out.println(l);
                }
                break;
            case "popRight":
                if (l.popRight() != null) {
                    System.out.println(l);
                }
                break;
            case "size":
                System.out.println(l.getSize());
                break;
            default:
                break;

            }
        }
    }
}

