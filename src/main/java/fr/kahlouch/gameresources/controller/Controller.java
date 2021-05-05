package fr.kahlouch.gameresources.controller;

import javafx.scene.input.InputEvent;


public abstract class Controller<E extends InputEvent> {
    private final InputEvent[] pending;
    private int head;
    private int tail;
    private final int maxPending;

    protected Controller(int maxPending) {
        this.maxPending = maxPending;
        this.pending = new InputEvent[maxPending];
    }


    public void handleInput(E inputEvent) {
        if (inputEvent == null) return;
        if ((tail + 1) % maxPending != head) {
            pending[tail] = inputEvent;
            tail = (tail + 1) % maxPending;
        }
    }

    public InputEvent nextCommand() {
        if (head == tail) return null;
        var toSend = pending[head];
        head = (head + 1) % maxPending;
        return toSend;
    }
}
