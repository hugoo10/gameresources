package gameresources.pattern.design.command.v3_undo;

import lombok.Getter;

@Getter
class Unit {
    private int x, y;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
