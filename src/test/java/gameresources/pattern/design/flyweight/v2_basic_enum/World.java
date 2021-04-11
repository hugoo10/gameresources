package gameresources.pattern.design.flyweight.v2_basic_enum;

class World {
    private static int WIDTH = 20, HEIGHT = 30;
    private Terrain[][] tiles_ = new Terrain[WIDTH][HEIGHT];

    public int getMovementCost(int x, int y) {
        return switch (tiles_[x][y]) {
            case TERRAIN_GRASS -> 1;
            case TERRAIN_HILL -> 3;
            case TERRAIN_RIVER -> 2;
        };
    }

    public boolean isWater(int x, int y) {
        return this.tiles_[x][y] == Terrain.TERRAIN_RIVER;
    }
}
