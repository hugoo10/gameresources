package gameresources.pattern.design.state.v7_hierarchical;

class JumpingState implements HeroineState {
    @Override
    public void handleInput(Heroine heroine, String input) {
        if ("PRESS_DOWN".equals(input)) {
            heroine.setState(diving);
            heroine.setGraphics("IMAGE_DIVE");
        }
    }

    @Override
    public void update(Heroine heroine) {
    }
}
