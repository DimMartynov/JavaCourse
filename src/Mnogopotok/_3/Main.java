package Mnogopotok._3;

public class Main {
    public static void main(String[] args) throws Exception {
        for (int k = 0; k<100;k++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    Counter.increment();
                }
            });
            thread.start();
            thread.join();
        }
        System.out.println("result: " + Counter.getCount());
    }
}
