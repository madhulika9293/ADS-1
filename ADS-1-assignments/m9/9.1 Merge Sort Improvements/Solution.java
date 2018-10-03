import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor.
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Mergeimp m = new Mergeimp();
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            m.sort(tokens);
            String str = "[";
            int i;
            for (i = 0; i < tokens.length - 1; i++) {
                str += tokens[i] + ", ";
            }
            str += tokens[i] + "]";
            System.out.println(str);
            System.out.println();
        }
    }
}

