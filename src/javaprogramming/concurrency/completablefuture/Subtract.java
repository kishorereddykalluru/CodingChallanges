package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Subtract {

    public CompletableFuture<Integer> subtract(int a, int b){
        return CompletableFuture.completedFuture(a - b);
    }
}
