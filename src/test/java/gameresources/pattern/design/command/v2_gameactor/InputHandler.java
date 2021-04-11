package gameresources.pattern.design.command.v2_gameactor;

interface InputHandler {
    ICommand handleInput();

    boolean isPressed(Object button);
}
