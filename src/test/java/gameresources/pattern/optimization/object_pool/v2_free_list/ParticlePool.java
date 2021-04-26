package gameresources.pattern.optimization.object_pool.v2_free_list;

class ParticlePool {
    private static final int POOL_SIZE = 100;

    private Particle firstAvailable;
    private Particle[] particle = new Particle[POOL_SIZE];

    public ParticlePool() {
        for (int i = POOL_SIZE - 1; i >= 0; --i) {
            particle[i] = new Particle();
            if (i < POOL_SIZE - 1) {
                particle[i].setNext(particle[i + 1]);
            }
        }
        firstAvailable = particle[0];
    }

    public void create(double x, double y, double xVel, double yVel, int lifetime) {
        assert (firstAvailable != null);
        Particle newParticle = firstAvailable;
        firstAvailable = newParticle.getNext();
        newParticle.init(x, y, xVel, yVel, lifetime);
    }

    public void animate() {
        for (int i = 0; i < POOL_SIZE; ++i) {
            if (particle[i].animate()) {
                particle[i].setNext(firstAvailable);
                firstAvailable = particle[i];
            }
        }
    }
}
