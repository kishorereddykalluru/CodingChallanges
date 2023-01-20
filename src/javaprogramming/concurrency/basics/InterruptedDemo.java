package javaprogramming.concurrency.basics;

import java.util.concurrent.TimeUnit;

public class InterruptedDemo implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            System.out.println( Thread.currentThread().getName()+" got interrupted");
        }

        while(!Thread.interrupted()){
            //do nothing
        }
        System.out.println(Thread.currentThread().getName()+" end of run method");
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new InterruptedDemo(), "myThread");
        thread.start();
        System.out.println(Thread.currentThread().getName()+" sleeping in main for 5 secs");

        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName()+" interrupting thread");
        thread.interrupted();

        System.out.println("["+Thread.currentThread().getName()+"] Sleeping  in main thread for 5s...");
        Thread.sleep(5000);
        System.out.println("["+Thread.currentThread().getName()+"] Interrupting myThread");
        thread.interrupt();


    }
}
