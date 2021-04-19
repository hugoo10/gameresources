package gameresources.pattern.behavioral.type_object.v2_the_pattern;

class Monster {
    private Breed breed;
    private int health;

    Monster(Breed breed) {
        this.health = breed.health();
    }

    public String getAttack() {
        return breed.attack();
    }
}
