package gameresources.pattern.behavioral.type_object.v1_typical_oop;

abstract class Monster {
    private int health;

    protected Monster(int startingHealth) {
        this.health = startingHealth;
    }

    public abstract String getAttack();
}
