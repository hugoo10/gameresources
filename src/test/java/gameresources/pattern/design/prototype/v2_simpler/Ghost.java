package gameresources.pattern.design.prototype.v2_simpler;

class Ghost implements Monster {
    private int health, speed;

    public Ghost(int health, int speed) {
        this.health = health;
        this.speed = speed;
    }

    @Override
    public Monster clone() {
        return new Ghost(this.health, this.speed);
    }
}
