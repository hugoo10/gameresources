package gameresources.pattern.behavioral.bytecode.v4_add_compexlity;

import java.util.HashMap;
import java.util.Map;

class WizardManager {
    private Map<Integer, Wizard> wizardMap = new HashMap<>();

    public WizardManager() {
        this.wizardMap.put(0, new Wizard(0));
    }

    public void setHealth(int wizard, int amount) {
        this.wizardMap.get(wizard).setHealth(amount);
    }

    public void setWisdom(int wizard, int amount) {
        this.wizardMap.get(wizard).setWisdom(amount);
    }

    public void setAgility(int wizard, int amount) {
        this.wizardMap.get(wizard).setAgility(amount);
    }

    public void playSound(int soundId) {
        System.out.printf("PLAY_SOUND: %d\n", soundId);
    }

    public void spawnParticles(int particleType) {
        System.out.printf("SPAWN_PARTICLES: %d\n", particleType);
    }

    public int getHealth(int wizard) {
        return this.wizardMap.get(wizard).getHealth();
    }

    public int getAgility(int wizard) {
        return this.wizardMap.get(wizard).getAgility();
    }

    public int getWisdom(int wizard) {
        return this.wizardMap.get(wizard).getWisdom();
    }
}
