package gameresources.pattern.sequencing.double_buffer.v_static_swap;

class Stage {
    private static final int NUM_ACTORS = 3;
    private Actor[] actors = new Actor[NUM_ACTORS];

    void add(Actor actor, int index) {
        actors[index] = actor;
    }

    void update() {
        for (int i = 0; i < NUM_ACTORS; ++i) {
            System.err.printf("Stage update actor %d ( %s )\n", i, actors[i].name);
            actors[i].update();
        }
        Actor.swap();
        System.err.println("Stage update ends");
    }
}
