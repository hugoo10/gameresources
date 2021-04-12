package gameresources.pattern.design.state.v2_with_state_with_flaws;

class Heroine {
    private static final int MAX_CHARGE = 20;
    private String yVelocity;
    private String graphics;
    private State state;

    private int chargeTime;

    public void handleInput(String input) {
        switch (state) {
            case STATE_STANDING -> {
                if ("PRESS_B".equals(input)) {
                    state = State.STATE_JUMPING;
                    yVelocity = "JUMP_VELOCITY";
                    setGraphics("IMAGE_JUMP");
                } else if ("PRESS_DOWN".equals(input)) {
                    state = State.STATE_DUCKING;
                    chargeTime = 0;
                    setGraphics("IMAGE_DUCK");
                }
            }
            case STATE_JUMPING -> {
                if ("PRESS_DOWN".equals(input)) {
                    state = State.STATE_DIVING;
                    setGraphics("IMAGE_DIVE");
                }
            }
            case STATE_DUCKING -> {
                if ("RELEASE_DOWN".equals(input)) {
                    state = State.STATE_STANDING;
                    setGraphics("IMAGE_STAND");
                }
            }
        }
    }

    public void update() {
        if (state == State.STATE_DUCKING) {
            chargeTime++;
            if (chargeTime > MAX_CHARGE) {
                superBomb();
            }

        }
    }

    public void superBomb() {
        System.out.println("BOOM");
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
}
