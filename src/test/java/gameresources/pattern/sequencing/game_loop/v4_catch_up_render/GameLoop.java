package gameresources.pattern.sequencing.game_loop.v4_catch_up_render;

class GameLoop {
    private static final long MS_PER_FRAME = 1000 / 60;

    public void gameLoop() throws InterruptedException {
        long previous = System.currentTimeMillis();
        long lag = 0;
        while (true) {
            long current = System.currentTimeMillis();
            long elapsed = current - previous;
            previous = current;
            lag += elapsed;
            processInput();
            while (lag >= MS_PER_FRAME) {
                update();
                lag -= MS_PER_FRAME;
            }
            render();

        }
        //PROBLEM: residual lag in render
    }

    private void render() {
    }

    private void update() {
    }

    private void processInput() {
    }
}
