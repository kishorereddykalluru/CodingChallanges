package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Subtract2 {

    public CompletableFuture subtract(int a, int b, int c){
        return CompletableFuture.completedFuture(a - b - c);
    }
}
