package gameresources.pattern.design.flyweight.v3_flyweight;

import java.util.Random;

class World {
    private static int WIDTH = 20, HEIGHT = 30;
    private Terrain[][] tiles_ = new Terrain[WIDTH][HEIGHT];

    private Terrain grassTerrain_;
    private Terrain hillTerrain_;
    private Terrain riverTerrain_;

    public World() {
        this.grassTerrain_ = new Terrain(1, false, "GRASS_TEXTURE");
        this.hillTerrain_ = new Terrain(3, false, "HILL_TEXTURE");
        this.riverTerrain_ = new Terrain(2, true, "RIVER_TEXTURE");
    }

    public Terrain getTile(int x, int y) {
        return tiles_[x][y];
    }

    public void generateTerrain() {
        for (int x = 0; x < WIDTH; ++x) {
            for (int y = 0; x < HEIGHT; ++y) {
                if (new Random().nextInt(10) == 0) {
                    tiles_[x][y] = hillTerrain_;
                } else {
                    tiles_[x][y] = grassTerrain_;
                }
            }
        }
        int x = new Random().nextInt(WIDTH);
        for (int y = 0; x < HEIGHT; ++y) {
            tiles_[x][y] = riverTerrain_;
        }
    }


}
