package gameresources.pattern.design.prototype.v3_alternative;

class Ghost implements Monster {
    private int health, speed;

    public Ghost(int health, int speed) {
        this.health = health;
        this.speed = speed;
    }
}
