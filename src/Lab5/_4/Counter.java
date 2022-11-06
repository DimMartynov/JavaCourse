package Lab5._4;

public class Counter {
    public void incount (String str, String substr) {
        int count = (str + " ").split(substr).length;
        System.out.println(count - 1);
        return;
    }
}
