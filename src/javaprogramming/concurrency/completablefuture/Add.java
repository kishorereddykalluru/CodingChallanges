package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Add {

    public CompletableFuture<Integer> add(int a, int b){
        return CompletableFuture.completedFuture(a + b);
    }
}
