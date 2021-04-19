package gameresources.pattern.behavioral.type_object.v3_more_complex;

record Breed(Breed parent, int health, String attack) {
    public Monster newMonster() {
        return new Monster(this);
    }

    @Override
    public int health() {
        if (health != 0 || parent == null) return health;
        return parent.health;
    }

    @Override
    public String attack() {
        if (attack != null || parent == null) return attack;
        return parent.attack;
    }
}
