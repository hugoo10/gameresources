package gameresources.pattern.optimization.data_locality.v3_not_optimized_particle_system;

class ParticleSystem {
    private static final int MAX_PARTICLES = 100_000;
    private int numParticles;
    final Particle[] particles = new Particle[MAX_PARTICLES];

    public ParticleSystem(int numParticles) {
        this.numParticles = numParticles;
    }

    public void update() {
        for (int i = 0; i < numParticles; ++i) {
            if (particles[i].isActive()) {
                particles[i].update();
            }
        }
    }
}
