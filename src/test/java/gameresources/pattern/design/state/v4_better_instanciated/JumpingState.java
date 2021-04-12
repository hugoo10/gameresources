package gameresources.pattern.design.state.v4_better_instanciated;

class JumpingState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("PRESS_DOWN".equals(input)) {
            heroine.setGraphics("IMAGE_DIVE");
            return new DivingState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }
}
