package gameresources.pattern.design.observer.v1;

import java.util.concurrent.Flow;

class Achievements implements Flow.Subscriber<GameEvent> {
    Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(GameEvent item) {
        System.out.println(item.getEvent());
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("END");
    }
}
