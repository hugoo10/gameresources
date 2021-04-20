package gameresources.pattern.decoupling.component.v4_pattern_refering_between_components;


class BjornPhysicsComponent implements PhysicsComponent {
    private Volume volume;

    @Override
    public void update(GameObject bjorn, World world) {
        bjorn.x += bjorn.velocity;
        world.resolveCollision(volume, bjorn.x, bjorn.y, bjorn.velocity);
    }

    public boolean isOnGround() {
        return true;
    }
}
