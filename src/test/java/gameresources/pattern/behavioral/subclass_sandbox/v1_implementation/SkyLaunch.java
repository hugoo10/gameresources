package gameresources.pattern.behavioral.subclass_sandbox.v1_implementation;

class SkyLaunch extends Superpower {
    @Override
    protected void activate() {
        playSound(SoundId.SOUND_SPROING, 1);
        spawnParticles(ParticleType.PARTICLE_DUST, 10);
        move(0, 0, 20);
    }
}
