package gameresources.pattern.design.state.v7_hierarchical;

class DuckingState extends OnGroundState {
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
        } else {
            super.handleInput(heroine, input);
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
