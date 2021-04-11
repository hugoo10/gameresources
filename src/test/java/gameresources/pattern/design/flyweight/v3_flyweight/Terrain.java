package gameresources.pattern.design.flyweight.v3_flyweight;

class Terrain {
    private final int movementCost;
    private final boolean isWater;
    private final Object texture;

    public Terrain(int movementCost, boolean isWater, Object texture) {
        this.movementCost = movementCost;
        this.isWater = isWater;
        this.texture = texture;
    }

    public int getMovementCost() {
        return movementCost;
    }

    public boolean isWater() {
        return isWater;
    }

    public Object getTexture() {
        return texture;
    }
}
