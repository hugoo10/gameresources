package gameresources.pattern.design.state.v6_concurrent;


class Heroine {

    private String yVelocity;
    private String graphics;
    private HeroineState state;
    private HeroineState equipment;

    public void handleInput(String input) {
        HeroineState state = this.state.handleInput(this, input);
        HeroineState equipment = this.equipment.handleInput(this, input);
        if (state != null) {
            this.state = state;
            this.state.enter(this);
        }
        if (equipment != null) {
            this.equipment = equipment;
            this.equipment.enter(this);
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
