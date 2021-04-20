package gameresources.pattern.decoupling.component.v5_pattern_messages;


class BjornPhysicsComponent implements PhysicsComponent {
    private Volume volume;

    @Override
    public void update(GameObject bjorn, World world) {
        bjorn.x += bjorn.velocity;
        world.resolveCollision(volume, bjorn.x, bjorn.y, bjorn.velocity);
    }

    @Override
    public void receive(int message) {

    }
}
