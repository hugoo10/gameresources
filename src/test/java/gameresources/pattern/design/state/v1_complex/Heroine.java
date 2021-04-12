package gameresources.pattern.design.state.v1_complex;

class Heroine {
    private String yVelocity;
    private String graphics;
    private boolean isJumping = false;
    private boolean isDucking = false;
    private boolean isDiving = false;

    public void handleInput(String input) {
        if ("PRESS_B".equals(input)) {
            // prevent air jumping
            if (!isJumping && !isDucking && !isDiving) {
                yVelocity = "JUMP_VELOCITY";
                setGraphics("IMAGE_JUMP");
                isJumping = true;
            }
        } else if ("PRESS_DOWN".equals(input)) {
            if (!isJumping && !isDiving) {
                isDucking = true;
                setGraphics("IMAGE_DUCK");
            } else {
                isJumping = false;
                isDiving = true;
                setGraphics("IMAGE_DIVE");
            }
        } else if ("RELEASE_DOWN".equals(input)) {
            if (isDucking) {
                isDucking = false;
                setGraphics("IMAGE_STAND");
            }
        }
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
}
