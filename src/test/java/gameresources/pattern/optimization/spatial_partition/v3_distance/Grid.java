package gameresources.pattern.optimization.spatial_partition.v3_distance;

class Grid {
    public static final int NUM_CELL = 10;
    public static final int CELL_SIZE = 20;
    private static final int ATTACK_DISTANCE = 15;
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
                handleCell(x, y);
            }
        }
    }

    private void handleCell(int x, int y) {
        Unit unit = cells[x][y];
        while (unit != null) {
            handleUnit(unit, unit.next);
            if (x > 0 && y > 0) handleUnit(unit, cells[x - 1][y - 1]);
            if (x > 0) handleUnit(unit, cells[x - 1][y]);
            if (y > 0) handleUnit(unit, cells[x][y - 1]);
            if (x > 0 && y < NUM_CELL - 1) handleUnit(unit, cells[x - 1][y + 1]);
            unit = unit.next;
        }
    }

    private void handleUnit(final Unit unit, final Unit other) {
        Unit otherUnit = other;
        while (otherUnit != null) {
            if (distance(unit, otherUnit) < ATTACK_DISTANCE) {
                handleAttack(unit, otherUnit);
            }
            otherUnit = otherUnit.next;
        }
    }

    private int distance(Unit cellUnit, Unit other) {
        return (int) Math.sqrt(Math.pow(cellUnit.x - other.x, 2) + Math.pow(cellUnit.y - other.y, 2));
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
