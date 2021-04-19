package gameresources.pattern.behavioral.type_object.v2_the_pattern;

record Breed(int health, String attack) {
    public Monster newMonster() {
        return new Monster(this);
    }
}
