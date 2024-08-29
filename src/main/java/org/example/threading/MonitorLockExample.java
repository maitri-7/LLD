package org.example.threading;

public class MonitorLockExample {
    public synchronized void task1() throws InterruptedException {
        System.out.println("Executing task1 which has synchronized method " + Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    public void task2() throws InterruptedException {
        System.out.println("Entered task2");
        synchronized (this) {
            System.out.println("Entered synchronized block" + Thread.currentThread().getName());
            Thread.sleep(5000);
        }
        System.out.println("Exited synchronized block");
    }

    public void task3() {
        System.out.println("Normal task");
    }
}
