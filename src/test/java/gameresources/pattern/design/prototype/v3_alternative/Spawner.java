package gameresources.pattern.design.prototype.v3_alternative;

import java.util.function.Supplier;

class Spawner {
    private Supplier<Monster> spawn;

    public Spawner(Supplier<Monster> spawn) {
        this.spawn = spawn;
    }


    Monster spawnMonster() {
        return spawn.get();
    }
}
