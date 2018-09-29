import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {
        // unused
    }

    /**
     * Converts the string number to digits and store in LL.
     *
     * @param      number  The number
     *
     * @return     Linked list of digits.
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList res = new LinkedList();
        for (int i = number.length() - 1; i >= 0; i--) {
            res.add(number.charAt(i));
            // System.out.println(number.charAt(i));
        }
        // res.print();
        // System.out.println("reached");
        return res;
    }

    /**
     * Converts the given digits to a number.
     *
     * @param      list  The list
     *
     * @return     String representation of the number.
     */
    public static String digitsToNumber(final LinkedList list) {
        String out = "";
        Iterator it = new Iterator(list.getHead());
        while (it.hasNext()) {
            out += it.next();
        }
        return out;
    }

    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     A linked list with the result.
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
            final LinkedList list2) {
        LinkedList res = new LinkedList();

        final int nine = 9;
        final int ten = 10;
        
        // list1.print();
        // list2.print();

        Stack s1 = new Stack();
        Iterator it1 = new Iterator(list1.getHead());
        while (it1.hasNext()) {
            s1.push(it1.next());
        }

        Stack s2 = new Stack();
        Iterator it2 = new Iterator(list2.getHead());
        while (it2.hasNext()) {
            s2.push(it2.next());
        }

        int carry = 0;

        while (!s1.isEmpty() && !s2.isEmpty()) {
            int sum = 0;
            int dig1 = Character.getNumericValue(s1.pop());
            int dig2 = Character.getNumericValue(s2.pop());
            if (carry == 0) {
                sum = dig1 + dig2;
            } else if (carry == 1) {
                sum = dig1 + dig2 + carry;
            }
            if (sum > nine) {
                carry = 1;
            }

            int toAdd = sum % ten;
            char addFin = (char) (toAdd + '0');

            res.add(addFin);
        }

        if (s1.isEmpty() && s2.isEmpty() && carry == 1) {
            char carrAdd = (char) (carry + '0');
            res.add(carrAdd);
        }

        while (!s1.isEmpty() && s2.isEmpty()) {
            int sum = 0;
            int dig1 = Character.getNumericValue(s1.pop());
            if (carry == 0) {
                sum = dig1;
            } else if (carry == 1) {
                sum = dig1 + carry;
            }
            if (sum > nine) {
                carry = 1;
            }

            int toAdd = sum % ten;
            char addFin = (char) (toAdd + '0');

            res.add(addFin);

        }

        while (!s2.isEmpty() && s1.isEmpty()) {
            int sum = 0;
            int dig2 = Character.getNumericValue(s2.pop());
            if (carry == 0) {
                sum = dig2;
            } else if (carry == 1) {
                sum = dig2 + carry;
            }
            if (sum > nine) {
                carry = 1;
            }

            int toAdd = sum % ten;
            char addFin = (char) (toAdd + '0');

            res.add(addFin);

        }

        return res;
    }
}

/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // unused
    }
    /**
     * Main method for Solution class.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
            break;
        }
    }

}
