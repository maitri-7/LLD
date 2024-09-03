package org.example.threading.locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    ReentrantLock lock;

    public SharedResource(ReentrantLock lock) {
        this.lock = lock;
    }
    public void task1() {
        try {
            lock.lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch(Exception e) {

        }
        finally {
            System.out.println("Lock unlocked by " + Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void task2() {
        System.out.println("Testing thread " + Thread.currentThread().getName());
    }
}
