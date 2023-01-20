package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Add2 {

    public CompletableFuture add(int a, int b, int c){
        return CompletableFuture.completedFuture(a + b + c);
    }
}
