package gameresources.pattern.design.command.v3_undo;

class ControllerInputHandler implements InputHandler {
    private Unit unit = new Unit(0, 0);
    private ICommand buttonX_;
    private ICommand buttonY_;
    private ICommand buttonA_;
    private ICommand buttonB_;

    @Override
    public ICommand handleInput() {
        Unit unit = getSelectedUnit();
        if (true) {
            int destY = unit.getY() - 1;
            return new MoveUnitCommand(unit, unit.getX(), destY);
        }
        if (isPressed("BUTTON_DOWN")) {
            int destY = unit.getY() + 1;
            return new MoveUnitCommand(unit, unit.getX(), destY);
        }
        return null;
    }

    @Override
    public boolean isPressed(Object button) {
        return false;
    }

    private Unit getSelectedUnit() {
        return unit;
    }
}
