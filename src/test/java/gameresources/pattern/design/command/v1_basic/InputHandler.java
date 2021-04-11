package gameresources.pattern.design.command.v1_basic;

interface InputHandler {
    void handleInput();

    boolean isPressed(Object button);
}
