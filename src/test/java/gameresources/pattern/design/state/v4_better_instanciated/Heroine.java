package gameresources.pattern.design.state.v4_better_instanciated;


class Heroine {

    private String yVelocity;
    private String graphics;
    private HeroineState state;

    public void handleInput(String input) {
        HeroineState state = this.state.handleInput(this, input);
        if (state != null) {
            this.state = state;
        }
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
