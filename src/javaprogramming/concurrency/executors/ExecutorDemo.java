package javaprogramming.concurrency.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        Executor executor = Executors.newSingleThreadExecutor();

        Runnable run = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My task1....");
        };

        executor.execute(run);
    }
}
