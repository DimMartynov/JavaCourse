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
            synchronized (lock) {
                try {
                    count += 1;
                    if (count>1000) {return;}
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
