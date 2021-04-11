package gameresources.pattern.design.prototype.v1_lourd;

class SorcererSpawner implements Spawner {
    @Override
    public Monster spawnMonster() {
        return new Sorcerer();
    }
}
