package Lab4_2._3;

public class Arr {

    public int[] PrintA(int[] a, int n) {
        int t = a[0];
        a[0] = a[n-1];
        a[n-1] = t;
        return a;
    }
}