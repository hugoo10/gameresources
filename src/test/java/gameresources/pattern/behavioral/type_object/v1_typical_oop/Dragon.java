package gameresources.pattern.behavioral.type_object.v1_typical_oop;

class Dragon extends Monster {
    public Dragon() {
        super(230);
    }

    @Override
    public String getAttack() {
        return "The dragon breathes fire!";
    }
}
