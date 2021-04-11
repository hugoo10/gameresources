package gameresources.pattern.design.command.v3_undo;

interface InputHandler {
    ICommand handleInput();

    boolean isPressed(Object button);
}
