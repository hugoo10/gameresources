package gameresources.pattern.behavioral.type_object.v4_copy_down_breed;

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
