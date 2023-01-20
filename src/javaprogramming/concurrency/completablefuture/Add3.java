package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Add3 {

    public CompletableFuture<Integer> add(int a, int b, int c, int d){
        return CompletableFuture.completedFuture(a + b + c + d);
    }
}
