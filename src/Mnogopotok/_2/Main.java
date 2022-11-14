package Mnogopotok._2;

public class Main {
    public static void main(String[] args) {
        Th2 th2 = new Th2();
        System.out.println("status: " + th2.getState());
        th2.start();
        th2.work();
        System.out.println("status: " + th2.getState());
    }
}
