package gameresources.pattern.behavioral.subclass_sandbox.v3_with_separate;

class SkyLaunch extends Superpower {
    private SkyLaunch() {
    }

    public static Superpower createSkyLaunch(ParticleSystem particles) {
        Superpower superpower = new SkyLaunch();
        superpower.init(particles);
        return superpower;
    }

    @Override
    protected void activate() {
        if (getHeroZ() == 0) {
            getSoundPlayer().playSound(SoundId.SOUND_SPROING, 1);
            spawnParticles(ParticleType.PARTICLE_DUST, 10);
            move(0, 0, 20);
        } else if (getHeroZ() < 10) {
            //double jump
            getSoundPlayer().playSound(SoundId.SOUND_SWOOP, 1);
            move(0, 0, getHeroZ() + 20);
        } else {
            getSoundPlayer().playSound(SoundId.SOUND_DIVE, 0.7);
            spawnParticles(ParticleType.PARTICLE_SPARKLES, 1);
            move(0, 0, -getHeroZ());
        }
    }
}
