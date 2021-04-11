package gameresources.pattern.design.command.v3_undo;

import java.util.ArrayList;
import java.util.List;

class Example {
    private List<ICommand> commands = new ArrayList<>();
    private InputHandler inputHandler = new ControllerInputHandler();
    private int idx = -1;


    public void example() {
        execute();
        execute();
        undo();
        redo();

    }

    public void execute() {
        ICommand command = inputHandler.handleInput();
        command.execute();
        if (++idx < commands.size()) {
            this.commands.set(idx, command);
        } else {
            commands.add(command);
        }
    }

    public void undo() {
        if (this.idx >= 0) {
            this.commands.get(idx).undo();
            --this.idx;
        }
    }

    public void redo() {
        if (this.idx < this.commands.size() - 1) {
            this.commands.get(idx + 1).execute();
            ++this.idx;
        }
    }
}
