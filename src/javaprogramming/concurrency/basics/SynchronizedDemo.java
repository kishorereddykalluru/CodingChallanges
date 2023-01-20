package javaprogramming.concurrency.basics;

public class SynchronizedDemo implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10 ; i++){
            /**
             * Object Synchronization
             *
             * when thread encounters this piece of code then it gets lock on thread and remaining threads
             * waits until current thread completes its execution
             */
            synchronized (SynchronizedDemo.class) {
            System.out.println("[" + Thread.currentThread().getName() + "] i value = " + i);
            }
        }
        System.out.println("["+Thread.currentThread().getName()+"] finished.");
    }


    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[5];

        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new SynchronizedDemo(), "sync-demo-"+i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("["+Thread.currentThread().getName()+"] All threads have finished.");
    }
}
