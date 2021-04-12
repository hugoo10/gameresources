package gameresources.pattern.design.state.v5_split_graphic;

class DivingState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {return null;}

    @Override
    public void update(Heroine heroine) {}

    @Override
    public void enter(Heroine heroine) {
        heroine.setGraphics("IMAGE_DIVE");
    }
}
