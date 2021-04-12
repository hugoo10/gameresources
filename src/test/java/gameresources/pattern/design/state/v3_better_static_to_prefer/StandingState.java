package gameresources.pattern.design.state.v3_better_static_to_prefer;

class StandingState implements HeroineState {
    @Override
    public void handleInput(Heroine heroine, String input) {
        if ("PRESS_B".equals(input)) {
            heroine.setState(jumping);
            heroine.setyVelocity("JUMP_VELOCITY");
            heroine.setGraphics("IMAGE_JUMP");
        } else if ("PRESS_DOWN".equals(input)) {
            heroine.setState(ducking);
            heroine.setGraphics("IMAGE_DUCK");
        }
    }

    @Override
    public void update(Heroine heroine) {
    }
}
