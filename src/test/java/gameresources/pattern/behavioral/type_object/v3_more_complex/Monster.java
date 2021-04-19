package gameresources.pattern.behavioral.type_object.v3_more_complex;

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
