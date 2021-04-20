package gameresources.pattern.decoupling.component.v1_very_coupled;


class Bjorn {
    private static final int WALK_ACCELERATION = 1;
    private int velocity;
    private int x;
    private int y;
    private Volume volume;
    private Sprite spriteStand;
    private Sprite spriteWalkLeft;
    private Sprite spriteWalkRight;


    public void update(World world, Graphics graphics) {
        switch (Controller.getJoystickDirection()) {
            case "DIR_LEFT" -> velocity -= WALK_ACCELERATION;
            case "DIR_RIGHT" -> velocity += WALK_ACCELERATION;
        }
        x += velocity;
        world.resolveCollision(volume, x, y, velocity);

        Sprite sprite = spriteStand;
        if (velocity < 0) {
            sprite = spriteWalkLeft;
        } else if (velocity > 0) {
            sprite = spriteWalkRight;
        }
        graphics.draw(sprite, x, y);
    }
}
