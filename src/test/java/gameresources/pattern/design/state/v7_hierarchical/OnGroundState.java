package gameresources.pattern.design.state.v7_hierarchical;

abstract class OnGroundState implements HeroineState {
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
}
