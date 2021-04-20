package gameresources.pattern.decoupling.component.v4_pattern_refering_between_components;


class PlayerInputComponent implements InputComponent {
    private static final int WALK_ACCELERATION = 1;

    @Override
    public void update(GameObject bjorn) {
        switch (Controller.getJoystickDirection()) {
            case "DIR_LEFT" -> bjorn.velocity -= WALK_ACCELERATION;
            case "DIR_RIGHT" -> bjorn.velocity += WALK_ACCELERATION;
        }
    }
}
