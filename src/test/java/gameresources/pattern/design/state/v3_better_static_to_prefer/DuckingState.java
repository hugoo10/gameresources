package gameresources.pattern.design.state.v3_better_static_to_prefer;

class DuckingState implements HeroineState {
    private static final int MAX_CHARGE = 20;
    private int chargeTime;

    public DuckingState() {
        this.chargeTime = 0;
    }

    @Override
    public void handleInput(Heroine heroine, String input) {
        if ("RELEASE_DOWN".equals(input)) {
            heroine.setState(standing);
            heroine.setGraphics("IMAGE_STAND");
        }
    }

    @Override
    public void update(Heroine heroine) {
        chargeTime++;
        if (chargeTime > MAX_CHARGE) {
            heroine.superBomb();
        }
    }
}
