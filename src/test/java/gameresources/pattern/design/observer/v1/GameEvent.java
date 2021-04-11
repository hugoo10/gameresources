package gameresources.pattern.design.observer.v1;

import lombok.Getter;

class GameEvent {
    @Getter
    private String event;
    private Entity entity;

    public GameEvent(String event) {
        this.event = event;
    }
}
