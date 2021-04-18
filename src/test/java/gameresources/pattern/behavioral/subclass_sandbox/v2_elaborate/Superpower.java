package gameresources.pattern.behavioral.subclass_sandbox.v2_elaborate;


abstract class Superpower {
    /**
     * Sandbox method
     */
    protected abstract void activate();

    protected double getHeroX() {
        return 0;
    }

    protected double getHeroY() {
        return 0;
    }

    protected double getHeroZ() {
        return 0;
    }


    protected void move(double x, double y, double z) {

    }

    protected void playSound(SoundId sound, double volume) {

    }

    protected void setVolume(SoundId sound, double volume) {

    }

    protected void stopSound(SoundId sound) {

    }

    protected void spawnParticles(ParticleType type, int count) {

    }
}
