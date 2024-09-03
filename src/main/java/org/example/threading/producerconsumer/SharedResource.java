package org.example.threading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> sharedBuffer;
    int bufferSize;

    SharedResource(int size) {
        sharedBuffer = new LinkedList<>();
        bufferSize = size;
    }

    public synchronized void produceItem(int item) throws InterruptedException {
        //waiting for consumer to consume an item so that producer can add item to buffer
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("Buffer is full, producer cannot store produced item hence waiting");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("size of buffer after producing is " + sharedBuffer.size());
        //notify consumer that item is now available
        notify();
    }

    public synchronized int consumeItem() throws InterruptedException {
        //waiting for producer to produce an item
        while(sharedBuffer.size() == 0) {
            System.out.println("Buffer is empty and there is no item present in buffer hence waiting");
            wait();
        }

        //consuming the top element by default
        int item = sharedBuffer.poll();
        System.out.println("Consumer item, size of buffer is " + sharedBuffer.size());
        //notify producer that buffer has space
        notify();

        return item;
    }
}
