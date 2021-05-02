package fr.kahlouch.gameresources.input_handling;

import javafx.scene.input.InputEvent;


public abstract class InputHandler {
    private static final int MAX_PENDING = 16;
    private final ICommand[] pending;
    private int head;
    private int tail;

    protected InputHandler() {
        this.pending = new ICommand[MAX_PENDING];
    }


    public void handleInput(InputEvent inputEvent) {
        var command = convertInputToCommand(inputEvent);
        addToPending(command);
    }

    protected abstract ICommand convertInputToCommand(InputEvent inputEvent);

    public ICommand nextCommand() {
        if (head == tail) return null;
        var toSend = pending[head];
        head = (head + 1) % MAX_PENDING;
        return toSend;
    }

    protected void addToPending(ICommand command) {
        if (command == null) return;
        if ((tail + 1) % MAX_PENDING != head) {
            pending[tail] = command;
            tail = (tail + 1) % MAX_PENDING;
        }
    }
}
