package gameresources.pattern.sequencing.double_buffer.v3_with_actors_not_working;

class Comedian extends Actor {
    private Actor facing;

    public Comedian(String name) {
        super(name);
    }

    void face(Actor actor) {
        facing = actor;
    }

    @Override
    void update() {
        if (isSlapped()) {
            System.err.printf("\t%s was slapped, so he slaps %s\n", this.name, facing.name);
            facing.slap();
        } else {
            System.err.printf("\t%s was not slapped, so he does nothing\n", this.name);
        }
    }
}
