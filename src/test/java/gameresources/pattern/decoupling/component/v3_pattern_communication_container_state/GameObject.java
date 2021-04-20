package gameresources.pattern.decoupling.component.v3_pattern_communication_container_state;


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
        return new GameObject(new PlayerInputComponent(), new BjornGraphicComponent(), new BjornPhysicsComponent());
    }

    public static GameObject createBjornDemo() {
        return new GameObject(new DemoInputComponent(), new BjornGraphicComponent(), new BjornPhysicsComponent());
    }
}
