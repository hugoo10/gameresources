package gameresources.pattern.design.prototype.v1_lourd;

class GhostSpawner implements Spawner {
    @Override
    public Monster spawnMonster() {
        return new Ghost();
    }
}
