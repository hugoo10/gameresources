package gameresources.pattern.sequencing.update_method.v2_fire_lightning;

class GameLoop {

    public void gameLoop() {
        Entity leftStatue = new Entity();
        Entity rightStatue = new Entity();
        int leftStatueFrames = 0;
        int rightStatueFrames = 0;

        while (true) {
            if (++leftStatueFrames == 90) {
                leftStatueFrames = 0;
                leftStatue.shootLightning();
            }
            if (++rightStatueFrames == 80) {
                rightStatueFrames = 0;
                rightStatue.shootLightning();
            }

            processInput();
            render();
        }
    }

    private void render() {
    }

    private void update() {
    }

    private void processInput() {
    }
}
