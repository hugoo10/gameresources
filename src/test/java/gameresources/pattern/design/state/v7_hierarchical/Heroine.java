package gameresources.pattern.design.state.v7_hierarchical;


class Heroine {

    private String yVelocity;
    private String graphics;
    private HeroineState state;

    public void handleInput(String input) {
        state.handleInput(this, input);
    }

    public void update() {
        state.update(this);
    }

    public void superBomb() {
        System.out.println("BOOM");
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setState(HeroineState state) {
        this.state = state;
    }

    public void setyVelocity(String yVelocity) {
        this.yVelocity = yVelocity;
    }
}
