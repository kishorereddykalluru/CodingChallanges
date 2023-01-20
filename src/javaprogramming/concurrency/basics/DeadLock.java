package javaprogramming.concurrency.basics;

import java.util.Random;

public class DeadLock implements Runnable{

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private final Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        Thread thread1 = new Thread(new DeadLock(), "thread-1");
        Thread thread2 = new Thread(new DeadLock(), "thread-2");

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        for(int i =0; i < 10000; i++){
            boolean b = random.nextBoolean();
            if(b){
                System.out.println("["+Thread.currentThread().getName()+"] Trying to get lock on resource 1");
                synchronized (resource1){
                    System.out.println("["+Thread.currentThread().getName()+"] locked resource 1");
                    System.out.println("["+Thread.currentThread().getName()+"] Trying to get lock on resource 2");
                    synchronized (resource2){
                        System.out.println("["+Thread.currentThread().getName()+"] locked resource 2");
                    }
                }
            } else {
                System.out.println("["+Thread.currentThread().getName()+"] Trying to get lock on resource 2");
                synchronized (resource2){
                    System.out.println("["+Thread.currentThread().getName()+"] locked resource 2");
                    System.out.println("["+Thread.currentThread().getName()+"] Trying to get lock on resource 1");
                    synchronized (resource1){
                        System.out.println("["+Thread.currentThread().getName()+"] locked resource 1");
                    }
                }
            }
        }
    }
}
