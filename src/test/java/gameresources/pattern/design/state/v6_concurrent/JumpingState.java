package gameresources.pattern.design.state.v6_concurrent;

class JumpingState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("PRESS_DOWN".equals(input)) {
            return new DivingState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }

    @Override
    public void enter(Heroine heroine) {
        heroine.setGraphics("IMAGE_JUMP");
    }
}
