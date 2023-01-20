package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Subtract3 {

    public CompletableFuture<Integer> subtract(int a, int b, int c){
        return CompletableFuture.completedFuture(a - b - c);
    }
}
