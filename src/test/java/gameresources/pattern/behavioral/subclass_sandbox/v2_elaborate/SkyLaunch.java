package gameresources.pattern.behavioral.subclass_sandbox.v2_elaborate;

class SkyLaunch extends Superpower {
    @Override
    protected void activate() {
        if (getHeroZ() == 0) {
            playSound(SoundId.SOUND_SPROING, 1);
            spawnParticles(ParticleType.PARTICLE_DUST, 10);
            move(0, 0, 20);
        } else if (getHeroZ() < 10) {
            //double jump
            playSound(SoundId.SOUND_SWOOP, 1);
            move(0, 0, getHeroZ() + 20);
        } else {
            playSound(SoundId.SOUND_DIVE, 0.7);
            spawnParticles(ParticleType.PARTICLE_SPARKLES, 1);
            move(0, 0, -getHeroZ());
        }
    }
}
