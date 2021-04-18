package gameresources.pattern.behavioral.bytecode.v4_add_compexlity;

class Wizard {
    private final int id_;
    private int agility_ = 100;
    private int health_ = 100;
    private int wisdom_ = 100;

    public Wizard(int id) {
        this.id_ = id;
    }

    public int getAgility() {
        return agility_;
    }

    public void setAgility(int agility) {
        this.agility_ = agility;
        System.out.printf("Set Agility for wizard: %d the amount: %d\n", id_, agility);
    }

    public int getHealth() {
        return health_;
    }

    public void setHealth(int health) {
        this.health_ = health;
        System.out.printf("Set Health for wizard: %d the amount: %d\n", id_, health);
    }

    public int getWisdom() {
        return wisdom_;
    }

    public void setWisdom(int wisdom) {
        this.wisdom_ = wisdom;
        System.out.printf("Set Wisdom for wizard: %d the amount: %d\n", id_, wisdom);
    }
}
