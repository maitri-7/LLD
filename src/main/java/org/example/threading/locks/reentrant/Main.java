package org.example.threading.locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        //here since we are passing lock in 2 different objects but the method will be only invoked by one thread at a time
        //since we are locking the task
        //synchronized keyword wont be able to lock the task for two different objects but reentrant will be able to put a lock
        // on the task even though there are 2 different objects.

        ReentrantLock lock = new ReentrantLock();
        SharedResource resource = new SharedResource(lock);
        SharedResource resource2 = new SharedResource(lock);

        Thread t1 = new Thread(() -> {
            resource.task1();
        });

        Thread t2 = new Thread(() -> {
            resource2.task1();
        });

        t1.start();
        t2.start();

    }
}
