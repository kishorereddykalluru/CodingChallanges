package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.*;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFutureDemo cfd = new CompletableFutureDemo();

        Future<String> stringFuture = cfd.calculateAsync();

        System.out.println(stringFuture.get());
    }

    public Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });
        return completableFuture;
    }
}
