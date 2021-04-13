package gameresources.pattern.sequencing.double_buffer.v3_with_actors_not_working;

abstract class Actor {
    private boolean slapped;
    String name;

    public Actor(String name) {
        slapped = false;
        this.name = name;
    }

    abstract void update();

    void reset() {
        slapped = false;
    }

    void slap() {
        slapped = true;
    }

    public boolean isSlapped() {
        return slapped;
    }
}
