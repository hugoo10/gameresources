package gameresources.pattern.sequencing.double_buffer.v_static_swap;

abstract class Actor {
    private static int current = 0;

    private boolean[] slapped = new boolean[2];
    String name;

    public Actor(String name) {
        slapped[current] = false;
        this.name = name;
    }

    abstract void update();

    void slap() {
        slapped[next()] = true;
    }

    static int next() {
        return 1 - current;
    }

    static void swap() {
        current = next();
    }

    public boolean isSlapped() {
        return slapped[current];
    }
}
