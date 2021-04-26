package gameresources.pattern.optimization.spatial_partition.v2_the_pattern;

class Grid {
    public static final int NUM_CELL = 10;
    public static final int CELL_SIZE = 20;
    private Unit[][] cells = new Unit[NUM_CELL][NUM_CELL];

    public Grid() {
        for (int x = 0; x < NUM_CELL; ++x) {
            for (int y = 0; y < NUM_CELL; ++y) {
                cells[x][y] = null;
            }
        }
    }

    public void add(Unit unit) {
        int cellX = (int) unit.x / CELL_SIZE;
        int cellY = (int) unit.y / CELL_SIZE;
        unit.previous = null;
        unit.next = cells[cellX][cellY];
        cells[cellX][cellY] = unit;

        if (unit.next != null) {
            unit.next.previous = unit;
        }
    }

    public void handleMelee() {
        for (int x = 0; x < NUM_CELL; ++x) {
            for (int y = 0; y < NUM_CELL; ++y) {
                handleCell(cells[x][y]);
            }
        }
    }

    private void handleCell(final Unit unit) {
        Unit cellUnit = unit;
        while (cellUnit != null) {
            Unit other = unit.next;
            while (other != null) {
                if (cellUnit.x == other.x && cellUnit.y == other.y) {
                    handleAttack(cellUnit, other);
                }
                other = other.next;
            }
            cellUnit = cellUnit.next;
        }
    }

    private void handleAttack(Unit unit, Unit unit1) {
    }

    public void move(Unit unit, double x, double y) {
        int oldCellX = (int) unit.x / CELL_SIZE;
        int oldCellY = (int) unit.y / CELL_SIZE;

        int newCellX = (int) x / CELL_SIZE;
        int newCellY = (int) y / CELL_SIZE;
        unit.x = x;
        unit.y = y;

        if (oldCellX == newCellX && oldCellY == newCellY) return;

        if (unit.previous != null) {
            unit.previous.next = unit.next;
        }

        if (unit.next != null) {
            unit.next.previous = unit.previous;
        }

        if (cells[oldCellX][oldCellY] == unit) {
            cells[oldCellX][oldCellY] = unit.next;
        }

        add(unit);
    }
}
