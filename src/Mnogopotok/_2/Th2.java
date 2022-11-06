package Mnogopotok._2;

import java.util.LinkedList;

public class Th2 extends Thread{
    public void work() {
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 10000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            linkedList.add(Math.random());
        }
        System.out.println("status: " + this.getState());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
    }
}
