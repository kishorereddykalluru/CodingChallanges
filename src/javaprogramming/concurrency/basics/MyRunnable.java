package javaprogramming.concurrency.basics;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "myRunnable-"+1);
        Thread thread1 = new Thread(new MyRunnable(), "myRunnable-"+2);

        thread.start();
        thread1.start();
    }
}
