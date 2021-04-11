package gameresources.pattern.design.command.v3_undo;

class MoveUnitCommand implements ICommand {
    private Unit unit;
    private int x_;
    private int y_;
    private int xBefore_;
    private int yBefore_;

    public MoveUnitCommand(Unit unit, int x_, int y_) {
        this.unit = unit;
        this.x_ = x_;
        this.y_ = y_;
    }

    @Override
    public void execute() {
        this.xBefore_ = unit.getX();
        this.yBefore_ = unit.getY();
        unit.moveTo(x_, y_);
    }

    @Override
    public void undo() {
        unit.moveTo(this.xBefore_, this.yBefore_);
    }
}
