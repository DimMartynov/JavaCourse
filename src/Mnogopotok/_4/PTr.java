package Mnogopotok._4;

class PTr extends Thread {
    private Object lock;

    private static volatile int count = 0;
    public PTr(Object object) {
        this.lock = object;
    }
    @Override
    public void run() {
        while (true) {
            count += 1;
            if (count>10) {return;}
            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
