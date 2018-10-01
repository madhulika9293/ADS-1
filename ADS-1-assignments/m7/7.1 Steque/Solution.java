/**
 * Scanner package import.
 */
import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // unused constructor

    }
    /**
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args       The arguments
     *
     * @throws     Exception  Steque is empty
     */
    public static void main(final String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String line;
        for (int i = 0; i < n; i++) {
            Steque l = new Steque();
            while (scan.hasNext()) {
                line = scan.nextLine();
                if (line.length() == 0) {
                    break;
                }
                String[] input = line.split(" ");
                switch (input[0]) {
                case "push":
                    l.push(Integer.parseInt(input[1]));
                    System.out.println(l);
                    break;
                case "pop":
                    try {
                        l.pop();
                        System.out.println(l);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "enqueue":
                    l.enqueue(Integer.parseInt(input[1]));
                    System.out.println(l);
                    break;
                default:
                    break;
                }
            }
            System.out.println();
        }
    }
}


