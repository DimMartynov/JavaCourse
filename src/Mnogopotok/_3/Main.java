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
//           thread.yield(); //таким образом не добиваемся значения 100000
//            thread.interrupt(); //значение 100000 также не достигается
            thread.join(); //значение всегда будет 100000
        }
        System.out.println("result: " + Counter.getCount());
    }
}
