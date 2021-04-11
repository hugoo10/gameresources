package gameresources.pattern.design.command.v1_basic;

class ControllerInputHandler implements InputHandler {
    private ICommand buttonX_;
    private ICommand buttonY_;
    private ICommand buttonA_;
    private ICommand buttonB_;

    @Override
    public void handleInput() {
        if (isPressed("BUTTON_X")) buttonX_.execute();
        else if (isPressed("BUTTON_Y")) buttonY_.execute();
        else if (isPressed("BUTTON_A")) buttonA_.execute();
        else if (isPressed("BUTTON_B")) buttonB_.execute();
    }

    @Override
    public boolean isPressed(Object button) {
        return false;
    }
}
