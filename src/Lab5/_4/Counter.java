package Lab5._4;

public class Counter {
    public int incount (String str, String substr) {
        int count = (str + " ").split(substr).length;
        return count - 1;
    }
}
