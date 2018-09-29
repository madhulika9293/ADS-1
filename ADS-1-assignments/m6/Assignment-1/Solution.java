import java.util.Scanner;
class AddLargeNumbers {

    public static LinkedList numberToDigits(String number) {
        LinkedList res = new LinkedList();
        for (int i = number.length()-1; i >=0; i--) {
            res.add(number.charAt(i));
            // System.out.println(number.charAt(i));
        }
        // res.print();
        // System.out.println("reached");
        return res;
    }

    public static String digitsToNumber(LinkedList list) {
        String out = "";
        String outFin = "";
        Iterator it = new Iterator(list.getHead());
        while (it.hasNext()) {
            out += it.next();
        }

        // for (int i = out.length() - 1; i >= 0; i--) {
        //     outFin += out.charAt(i);
        // }
        // return outFin;
        return out;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList res = new LinkedList();

        // list1.print();
        // list2.print();

        Stack s1 = new Stack();
        Iterator it1 = new Iterator(list1.getHead());
        while (it1.hasNext()) {
            s1.push(it1.next());
        }

        // while (!s1.isEmpty()) {
        //     System.out.println(s1.pop());
        // }

        Stack s2 = new Stack();
        Iterator it2 = new Iterator(list2.getHead());
        while (it2.hasNext()) {
            s2.push(it2.next());
        }

        // Stack carry = new Stack();
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
            if (sum > 9) {
                carry = 1;
            }

            int toAdd = sum % 10;
            char addFin = (char)(toAdd + '0');

            res.add(addFin);
        }
        return res;
    }
}

public class Solution {
    public static void main(String[] args) {
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
        }
    }

}
