package javaprogramming.concurrency.basics;

/**
 * join() makes sure that current thread will wait until all its child thread finished their jobs
 *
 * output cannot be predicted because thread execution is random...
 *
 * Check SynchronizedDemo class for ordered execution
 *
 * JoinDemo
 *
 */
public class JoinDemo implements Runnable{

    @Override
    public void run() {
            for(int i = 0; i < 10 ; i++){
                //synchronized (JoinDemo.class) {
                    System.out.println("[" + Thread.currentThread().getName() + "] i value = " + i);
                //}
            }
        System.out.println("["+Thread.currentThread().getName()+"] finished.");
    }


    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[5];

        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new JoinDemo(), "join-demo-"+i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("["+Thread.currentThread().getName()+"] All threads have finished.");
    }
}
