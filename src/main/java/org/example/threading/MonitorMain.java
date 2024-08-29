package org.example.threading;

public class MonitorMain {
    public static void main(String[] args) {
        MonitorLockExample ex = new MonitorLockExample();
        Thread t1 = new Thread(() -> {
            try {
                ex.task2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                ex.task2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
