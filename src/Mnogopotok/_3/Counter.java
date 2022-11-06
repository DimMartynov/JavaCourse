package Mnogopotok._3;

public class Counter {
    private static volatile int count = 0;

    public static int getCount() { return count; }

    synchronized public static void increment() {
        count += 1;
    }
}
