package gameresources.pattern.optimization.object_pool.v1_pattern;

class Particle {
    private int framesLeft;
    private double x, y;
    private double xVel, yVel;

    public void init(double x, double y, double xVel, double yVel, int lifetime) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
        this.framesLeft = lifetime;
    }

    public void animate() {
        if (!inUse()) return;
        framesLeft--;
        x += xVel;
        y += yVel;
    }

    public boolean inUse() {
        return framesLeft > 0;
    }
}
