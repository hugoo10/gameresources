package gameresources.pattern.optimization.data_locality.v4_optimized;

class ParticleSystem {
    private static final int MAX_PARTICLES = 100_000;
    private int numActives;
    final Particle[] particles = new Particle[MAX_PARTICLES];

    public ParticleSystem() {
        this.numActives = 0;
    }

    public void activateParticle(int index) {
        assert index >= numActives;
        Particle temp = particles[numActives];
        particles[numActives] = particles[index];
        particles[index] = temp;
        numActives++;
    }

    public void deactivateParticle(int index) {
        assert index < numActives;

        numActives--;

        Particle temp = particles[numActives];
        particles[numActives] = particles[index];
        particles[index] = temp;
    }

    public void update() {
        for (int i = 0; i < numActives; ++i) {
            particles[i].update();
        }
    }
}
