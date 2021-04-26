package gameresources.pattern.optimization.object_pool.v2_free_list;

class Particle {
    private int framesLeft;
    private double x, y;
    private double xVel, yVel;
    private Particle next;

    public Particle getNext() {
        return next;
    }

    public void setNext(Particle next) {
        this.next = next;
    }

    public void init(double x, double y, double xVel, double yVel, int lifetime) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
        this.framesLeft = lifetime;
    }

    public boolean animate() {
        if (!inUse()) return false;
        framesLeft--;
        x += xVel;
        y += yVel;
        return framesLeft == 0;
    }

    public boolean inUse() {
        return framesLeft > 0;
    }
}
