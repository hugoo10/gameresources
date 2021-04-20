package gameresources.pattern.decoupling.component.v5_pattern_messages;


import java.util.ArrayList;
import java.util.List;

class GameObject {
    public int velocity;
    public int x;
    public int y;

    private final InputComponent inputComponent;
    private final GraphicComponent graphicComponent;
    private final PhysicsComponent physicsComponent;

    private final List<Component> componentList = new ArrayList<>();

    private GameObject(InputComponent inputComponent, GraphicComponent graphicComponent, PhysicsComponent physicsComponent) {
        this.inputComponent = inputComponent;
        this.graphicComponent = graphicComponent;
        this.physicsComponent = physicsComponent;
        this.componentList.add(inputComponent);
        this.componentList.add(graphicComponent);
        this.componentList.add(physicsComponent);
    }

    public void update(World world, Graphics graphics) {
        inputComponent.update(this);
        physicsComponent.update(this, world);
        graphicComponent.update(this, graphics);
    }

    public void send(int message) {
        this.componentList.forEach(c -> c.receive(message));
    }

    public static GameObject createBjorn() {
        return new GameObject(new PlayerInputComponent(), new BjornGraphicComponent(), new BjornPhysicsComponent());
    }
}
