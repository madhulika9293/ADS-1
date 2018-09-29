import java.util.Scanner;
class AddLargeNumbers {

    public static LinkedList numberToDigits(String number) {
        LinkedList res = new LinkedList();
        for (int i = 0; i < number.length(); i++) {
            res.add(number.charAt(i));
        }
        return res;
    }

    public static String digitsToNumber(LinkedList list) {
        String out = "";
        Node temp = list.getHead();
        while (!list.isEmpty()) {
            out += temp.data;
            temp = temp.next;
        }
        return out;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList res = new LinkedList();
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
