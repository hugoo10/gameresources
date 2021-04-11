package gameresources.pattern.design.observer.v1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.SubmissionPublisher;


class Example {
    void example() {
        //Semaphore semaphore = new Semaphore(1);
        SubmissionPublisher<GameEvent> pub = new SubmissionPublisher<>();
        pub.subscribe(new Achievements());

        CompletableFuture<Void> fut = pub.consume(g -> System.err.println("HALLO"));
        pub.submit(new GameEvent("TEST"));
        pub.submit(new GameEvent("TEST2"));
        pub.close();
        try {
            fut.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
