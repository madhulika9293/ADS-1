
public class CubeSum implements Comparable<CubeSum> {
    private final int sum;
    private final int i;
    private final int j;

    public CubeSum(int i, int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }


    public static void main(String[] args) {

        int n = 3;

        // initialize priority queue
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        MinPQ<CubeSum> out = new MinPQ<CubeSum>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
        }
        // pq.print();

        while (!pq.isEmpty()) {
            // CubeSum s = pq.min();
            CubeSum s = pq.delMin();
            // System.out.println(s);
            out.insert(s);
            if (s.j < n) {
                pq.insert(new CubeSum(s.i, s.j + 1));
            }
        }
        System.out.println("out");
        out.print();
    }


}

