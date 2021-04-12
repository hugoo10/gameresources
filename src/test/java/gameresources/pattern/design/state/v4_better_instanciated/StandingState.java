package gameresources.pattern.design.state.v4_better_instanciated;

class StandingState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("PRESS_B".equals(input)) {
            heroine.setyVelocity("JUMP_VELOCITY");
            heroine.setGraphics("IMAGE_JUMP");
            return new JumpingState();
        } else if ("PRESS_DOWN".equals(input)) {
            heroine.setGraphics("IMAGE_DUCK");
            return new DuckingState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }
}
