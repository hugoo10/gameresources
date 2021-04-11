package gameresources.pattern.design.command.v2_gameactor;

import org.junit.jupiter.api.Test;

class Example {
    @Test
    void commandTest() {
        InputHandler inputHandler = new ControllerInputHandler();
        ICommand command = inputHandler.handleInput();
        if (command != null) {
            command.execute(null);
        }
    }
}
