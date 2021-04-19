package gameresources.pattern.behavioral.type_object.v1_typical_oop;

class Troll extends Monster {
    public Troll() {
        super(48);
    }

    @Override
    public String getAttack() {
        return "The troll clubs you!";
    }
}
