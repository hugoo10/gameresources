package gameresources.pattern.optimization.data_locality.v1_component_pattern;

class GameEntity {
    private AIComponent ai;
    private PhysicsComponent physics;
    private RenderComponent render;

    public GameEntity(AIComponent ai, PhysicsComponent physics, RenderComponent render) {
        this.ai = ai;
        this.physics = physics;
        this.render = render;
    }

    public AIComponent getAi() {
        return ai;
    }

    public PhysicsComponent getPhysics() {
        return physics;
    }

    public RenderComponent getRender() {
        return render;
    }
}
