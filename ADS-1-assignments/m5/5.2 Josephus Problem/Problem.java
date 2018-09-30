class Problem {
    /**
     * Class for node.
     */
    private class node {
        int data;
        node next;
        node(int d) {
            data = d;
        }
    }
    int size;
    int count;
    node head, tail;
    String result = "";
    Problem(int s, int c) {
        size = s;
        count = c;
    }
    /**
     * FInds the solution to Josephs problem.
     */
    public void josephproblem() {
        node newnode = new node(0);
        head = newnode;
        tail = newnode;
        for (int i = 1; i < size; i++) {
            node n = new node(i);
            tail.next = n;
            tail = n;
        }
        int c;
        node temp;
        while (size != 1) {
            for (c = 1; c < count; c++) {
                temp = head;
                head = head.next;
                tail.next = temp;
                tail = temp;
            }
            result += head.data + " ";
            head = head.next;
            c = 1;
            size--;
        }
        result += head.data;
        System.out.println(result);
    }
}