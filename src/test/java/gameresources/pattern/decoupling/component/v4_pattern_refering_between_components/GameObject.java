package gameresources.pattern.decoupling.component.v4_pattern_refering_between_components;


class GameObject {
    public int velocity;
    public int x;
    public int y;

    private final InputComponent inputComponent;
    private final GraphicComponent graphicComponent;
    private final PhysicsComponent physicsComponent;

    private GameObject(InputComponent inputComponent, GraphicComponent graphicComponent, PhysicsComponent physicsComponent) {
        this.inputComponent = inputComponent;
        this.graphicComponent = graphicComponent;
        this.physicsComponent = physicsComponent;
    }

    public void update(World world, Graphics graphics) {
        inputComponent.update(this);
        physicsComponent.update(this, world);
        graphicComponent.update(this, graphics);
    }

    public static GameObject createBjorn() {
        BjornPhysicsComponent bjornPhysicsComponent = new BjornPhysicsComponent();
        return new GameObject(new PlayerInputComponent(), new BjornGraphicComponent(bjornPhysicsComponent), bjornPhysicsComponent);
    }
}
