package Mnogopotok._2;

import java.util.LinkedList;

public class Th2 extends Thread{
    public void work() {
        int n = 10000;
        int m = 1000;
        System.out.println("status: " + this.getState());
        for (int i = 0; i < m; i++) {
            n++;
        }
    }
}
