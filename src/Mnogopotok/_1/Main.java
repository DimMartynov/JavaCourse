package Mnogopotok._1;

public class Main {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 11; i++) {
            int i2 = i;
            new Thread(() -> {
                System.out.println("tr1 ready");
                for (int j = 0; j <= 100; j++) {
                    System.out.println("tr" + i2 + ": " + j);
                }
            }).start();
        }
    }

}
