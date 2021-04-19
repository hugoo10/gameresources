package gameresources.pattern.behavioral.type_object.v4_copy_down_breed;

class Breed {
    private int health;
    private String attack;

    Breed(Breed parent, int health, String attack) {
        this.health = health;
        this.attack = attack;
        if (parent != null) {
            if (health == 0) this.health = parent.health;
            if (attack == null) this.attack = parent.attack;
        }
    }

    public Monster newMonster() {
        return new Monster(this);
    }

    public int health() {
        return health;
    }

    public String attack() {
        return attack;
    }
}
