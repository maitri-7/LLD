package org.example.threading.producerconsumer;

public class Main {
    //creating shared resource
    SharedResource resource = new SharedResource(2);
    Thread producerThread = new Thread(() -> {
        for(int i=0;i<5;i++) {
            try {
                resource.produceItem(i);
            } catch (InterruptedException e) {
                //error
            }
        }
    });

    Thread consumerThread = new Thread(() -> {
       for(int i=0;i<4;i++) {
           try {
               resource.consumeItem();
           } catch (InterruptedException e) {
               //error
           }
       }
    });

//    producerThread.start();
//    consumerThread.start();

}
