package gameresources.pattern.decoupling.component.v2_sliced;



class PhysicsComponent {
    private Volume volume;

    public void update(Bjorn bjorn, World world) {
        bjorn.x += bjorn.velocity;
        world.resolveCollision(volume, bjorn.x, bjorn.y, bjorn.velocity);
    }
}
