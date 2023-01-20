package javaprogramming.concurrency.basics;

public class UnsynchronizedDemo implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];


        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new UnsynchronizedDemo(), "unsync-demo-"+i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("["+Thread.currentThread().getName()+"] All threads have finished.");
    }
    private static int counter = 0;
    //private AtomicInteger counter = new AtomicInteger(0);
    @Override
    public void run() {

        while(counter < 10){
            /**
             * with this style of execution we cannot predict output or results
             *
             * uncomment synchronized then results are as expected
             */
            //synchronized (UnsynchronizedDemo.class) {
                System.out.println("[" + Thread.currentThread().getName() + "] before = " + counter);
                counter++;
                System.out.println("[" + Thread.currentThread().getName() + "] after = " + counter);
            //}
        }
    }
}
