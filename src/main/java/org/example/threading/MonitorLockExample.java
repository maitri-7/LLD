package org.example.threading;

public class MonitorLockExample {
    public synchronized void task1() throws InterruptedException {
        System.out.println("Executing task1 which has synchronized method " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Executed task1 which has synchronized method " + Thread.currentThread().getName());
    }

    public void task2() throws InterruptedException {
        System.out.println("Entered task2");
        synchronized (this) {
            System.out.println("Entered synchronized block" + Thread.currentThread().getName());
            Thread.sleep(5000);
        }
        System.out.println("Exited synchronized block " + Thread.currentThread().getName());
    }

    public synchronized void task4() throws InterruptedException {
        System.out.println("Executing task4 which has synchronized method " + Thread.currentThread().getName());
        Thread.sleep(7000);
        System.out.println("Executed task4 which has synchronized method " + Thread.currentThread().getName());

    }


    public void task3() {
        System.out.println("Normal task " + Thread.currentThread().getName());
    }
}
