package gameresources.pattern.optimization.spatial_partition.v2_the_pattern;

class Unit {
    double x, y;
    private Grid grid;

    Unit next;
    Unit previous;

    public Unit(double x, double y, Grid grid) {
        this.x = x;
        this.y = y;
        previous = null;
        next = null;
        this.grid = grid;
        this.grid.add(this);
    }

    public void move(double x, double y) {
        grid.move(this, x, y);
    }
}
