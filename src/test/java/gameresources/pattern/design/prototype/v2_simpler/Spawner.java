package gameresources.pattern.design.prototype.v2_simpler;

class Spawner {
    private Monster prototype;

    public Spawner(Monster prototype) {
        this.prototype = prototype;
    }

    Monster spawnMonster() {
        return prototype.clone();
    }
}
