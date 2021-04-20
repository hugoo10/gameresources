package gameresources.pattern.decoupling.component.v2_sliced;


class Bjorn {
    public int velocity;
    public int x;
    public int y;

    private InputComponent inputComponent;
    private GraphicComponent graphicComponent;
    private PhysicsComponent physicsComponent;

    public void update(World world, Graphics graphics) {
        inputComponent.update(this);
        physicsComponent.update(this, world);
        graphicComponent.update(this, graphics);
    }
}
