package gameresources.pattern.decoupling.component.v3_pattern_communication_container_state;


class BjornPhysicsComponent implements PhysicsComponent {
    private Volume volume;

    @Override
    public void update(GameObject bjorn, World world) {
        bjorn.x += bjorn.velocity;
        world.resolveCollision(volume, bjorn.x, bjorn.y, bjorn.velocity);
    }
}
