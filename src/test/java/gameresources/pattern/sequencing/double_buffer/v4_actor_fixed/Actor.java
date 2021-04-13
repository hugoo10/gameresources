package gameresources.pattern.sequencing.double_buffer.v4_actor_fixed;

abstract class Actor {
    private boolean currentSlapped;
    private boolean nextSlapped;
    String name;

    public Actor(String name) {
        currentSlapped = false;
        this.name = name;
    }

    abstract void update();

    void slap() {
        nextSlapped = true;
    }

    void swap() {
        currentSlapped = nextSlapped;
        nextSlapped = false;
    }

    public boolean isSlapped() {
        return currentSlapped;
    }
}
