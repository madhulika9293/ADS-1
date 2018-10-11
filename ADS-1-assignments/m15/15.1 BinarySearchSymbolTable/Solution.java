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
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        BinaryST<String, Integer> b = new BinaryST<String, Integer>();
        for (int i = 0; i < line.length; i++) {
            b.put(line[i], i);
        }
        while (scan.hasNext()) {
            String[] s = scan.nextLine().split(" ");
            switch (s[0]) {
            case "max":
                System.out.println(b.getMax());
                break;
            case "floor":
                System.out.println(b.getFloor(s[1]));
                break;
            case "rank":
                System.out.println(b.getRank(s[1]));
                break;
            case "deleteMin":
                b.deleteMin();
                break;
            case "contains":
                System.out.println(b.contains(s[1]));
                break;
            case "keys":
                System.out.println(b.toString());
                break;
            case "get":
                System.out.println(b.get(s[1]));
                break;
            default:
                break;
            }
        }
    }
}
