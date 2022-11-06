package Mnogopotok._4;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        new PTr(lock).start();
        new PTr(lock).start();
    }
}
