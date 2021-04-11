package gameresources.pattern.design.command.v2_gameactor;

public class ControllerInputHandler implements InputHandler {
    private ICommand buttonX_;
    private ICommand buttonY_;
    private ICommand buttonA_;
    private ICommand buttonB_;

    @Override
    public ICommand handleInput() {
        if (isPressed("BUTTON_X")) return buttonX_;
        else if (isPressed("BUTTON_Y")) return buttonY_;
        else if (isPressed("BUTTON_A")) return buttonA_;
        else if (isPressed("BUTTON_B")) return buttonB_;

        return null;
    }

    @Override
    public boolean isPressed(Object button) {
        return false;
    }
}
