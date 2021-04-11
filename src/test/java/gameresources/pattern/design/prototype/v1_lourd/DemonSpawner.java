package gameresources.pattern.design.prototype.v1_lourd;

class DemonSpawner implements Spawner {
    @Override
    public Monster spawnMonster() {
        return new Demon();
    }
}
