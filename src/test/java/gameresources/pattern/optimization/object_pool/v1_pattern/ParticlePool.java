package gameresources.pattern.optimization.object_pool.v1_pattern;

class ParticlePool {
    private static final int POOL_SIZE = 100;
    private Particle[] particle = new Particle[POOL_SIZE];

    public ParticlePool() {
        for (int i = 0; i < POOL_SIZE; ++i) {
            particle[i] = new Particle();
        }
    }

    public void create(double x, double y, double xVel, double yVel, int lifetime) {
        for (int i = 0; i < POOL_SIZE; ++i) {
            if (!particle[i].inUse()) {
                particle[i].init(x, y, xVel, yVel, lifetime);
                return;
            }
        }
    }

    public void animate() {
        for (int i = 0; i < POOL_SIZE; ++i) {
            particle[i].animate();
        }
    }
}
