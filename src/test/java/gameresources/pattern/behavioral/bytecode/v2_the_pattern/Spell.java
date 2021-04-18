package gameresources.pattern.behavioral.bytecode.v2_the_pattern;

class Spell {

    public void setHealth(int wizard, int amount) {
        System.out.printf("Set Health for wizard: %d the amount: %d\n", wizard, amount);
    }

    public void setWisdom(int wizard, int amount) {
        System.out.printf("Set Wisdom for wizard: %d the amount: %d\n", wizard, amount);
    }

    public void setAgility(int wizard, int amount) {
        System.out.printf("Set Agility for wizard: %d the amount: %d\n", wizard, amount);
    }

    public void playSound(int soundId) {
        System.out.printf("PLAY_SOUND: %d\n", soundId);
    }

    public void spawnParticles(int particleType) {
        System.out.printf("SPAWN_PARTICLES: %d\n", particleType);
    }
}
