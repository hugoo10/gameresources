package gameresources.pattern.decoupling.component.v5_pattern_messages;


class PlayerInputComponent implements InputComponent {
    private static final int WALK_ACCELERATION = 1;

    @Override
    public void update(GameObject bjorn) {
        switch (Controller.getJoystickDirection()) {
            case "DIR_LEFT" -> bjorn.velocity -= WALK_ACCELERATION;
            case "DIR_RIGHT" -> bjorn.velocity += WALK_ACCELERATION;
        }
    }

    @Override
    public void receive(int message) {

    }
}
