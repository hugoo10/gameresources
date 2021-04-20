package gameresources.pattern.decoupling.component.v5_pattern_messages;

class BjornGraphicComponent implements GraphicComponent {
    private Sprite spriteStand;
    private Sprite spriteWalkLeft;
    private Sprite spriteWalkRight;

    @Override
    public void update(GameObject bjorn, Graphics graphics) {
        Sprite sprite = spriteStand;
        if (bjorn.velocity < 0) {
            sprite = spriteWalkLeft;
        } else if (bjorn.velocity > 0) {
            sprite = spriteWalkRight;
        }
        graphics.draw(sprite, bjorn.x, bjorn.y);
    }

    @Override
    public void receive(int message) {

    }
}
