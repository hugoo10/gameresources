package gameresources.pattern.design.state.v6_concurrent;

class StandingState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("PRESS_B".equals(input)) {
            heroine.setyVelocity("JUMP_VELOCITY");
            return new JumpingState();
        } else if ("PRESS_DOWN".equals(input)) {
            return new DuckingState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }

    @Override
    public void enter(Heroine heroine) {
        heroine.setGraphics("IMAGE_STAND");
    }
}
