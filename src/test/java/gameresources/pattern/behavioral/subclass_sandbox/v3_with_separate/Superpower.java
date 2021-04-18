package gameresources.pattern.behavioral.subclass_sandbox.v3_with_separate;


abstract class Superpower {
    private SoundPlayer soundPlayer;
    private ParticleSystem particleSystem;

    protected SoundPlayer getSoundPlayer() {
        return soundPlayer;
    }

    public void init(ParticleSystem particleSystem) {
        this.particleSystem = particleSystem;
    }

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

    protected void spawnParticles(ParticleType type, int count) {

    }
}
