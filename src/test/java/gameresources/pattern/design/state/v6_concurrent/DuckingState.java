package gameresources.pattern.design.state.v6_concurrent;

class DuckingState implements HeroineState {
    private static final int MAX_CHARGE = 20;
    private int chargeTime;

    public DuckingState() {
        this.chargeTime = 0;
    }

    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("RELEASE_DOWN".equals(input)) {
            return new StandingState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
        chargeTime++;
        if (chargeTime > MAX_CHARGE) {
            heroine.superBomb();
        }
    }

    @Override
    public void enter(Heroine heroine) {
        heroine.setGraphics("IMAGE_DUCK");
    }
}
