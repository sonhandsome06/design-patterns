package async;

import async.exceptions.CompletableFutureException;

import java.util.concurrent.CompletableFuture;

public class DemoCompletableFuture {

    public CompletableFuture<String> asyncMethod1() {
        return CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new CompletableFutureException();
            }
            return "Result from method 1";
        });
    }
}
