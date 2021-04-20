package gameresources.pattern.decoupling.component.v4_pattern_refering_between_components;

class BjornGraphicComponent implements GraphicComponent {
    private final BjornPhysicsComponent physicsComponent;
    private Sprite spriteStand;
    private Sprite spriteWalkLeft;
    private Sprite spriteWalkRight;
    private Sprite spriteJump;

    public BjornGraphicComponent(BjornPhysicsComponent physicsComponent) {
        this.physicsComponent = physicsComponent;
    }

    @Override
    public void update(GameObject bjorn, Graphics graphics) {
        Sprite sprite = spriteStand;
        if (!physicsComponent.isOnGround()) {
            sprite = spriteJump;
        } else {
            if (bjorn.velocity < 0) {
                sprite = spriteWalkLeft;
            } else if (bjorn.velocity > 0) {
                sprite = spriteWalkRight;
            }
        }
        graphics.draw(sprite, bjorn.x, bjorn.y);
    }
}
