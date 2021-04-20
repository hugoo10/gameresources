package gameresources.pattern.decoupling.component.v2_sliced;


class InputComponent {
    private static final int WALK_ACCELERATION = 1;

    public void update(Bjorn bjorn) {
        switch (Controller.getJoystickDirection()) {
            case "DIR_LEFT" -> bjorn.velocity -= WALK_ACCELERATION;
            case "DIR_RIGHT" -> bjorn.velocity += WALK_ACCELERATION;
        }
    }
}
