package org.example.threading;

public class MonitorMain {
    public static void main(String[] args) {
        MonitorLockExample ex = new MonitorLockExample();
        Thread t1 = new Thread(() -> {
            try {
                ex.task1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                ex.task2();
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
                ex.task3();
        });

        Thread t4 = new Thread(() -> {
            try {
                ex.task4();
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //NOTE: All synchronized methods/block share the same monitor lock.
        //any thread can enter non syncrhonized method
    }
}
