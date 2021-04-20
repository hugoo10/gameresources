package gameresources.pattern.decoupling.component.v2_sliced;

class GraphicComponent {
    private Sprite spriteStand;
    private Sprite spriteWalkLeft;
    private Sprite spriteWalkRight;

    public void update(Bjorn bjorn, Graphics graphics) {
        Sprite sprite = spriteStand;
        if (bjorn.velocity < 0) {
            sprite = spriteWalkLeft;
        } else if (bjorn.velocity > 0) {
            sprite = spriteWalkRight;
        }
        graphics.draw(sprite, bjorn.x, bjorn.y);
    }
}
