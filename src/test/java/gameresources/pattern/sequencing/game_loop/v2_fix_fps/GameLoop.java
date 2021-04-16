package gameresources.pattern.sequencing.game_loop.v2_fix_fps;

class GameLoop {
    private static final long MS_PER_FRAME = 1000 / 60;

    public void gameLoop() throws InterruptedException {
        while (true) {
            long start = System.currentTimeMillis();
            processInput();
            update();
            render();
            wait(start + MS_PER_FRAME - System.currentTimeMillis());
        }
        // PROBLEM: if a step is slower than the desire fps it will impact the game
    }

    private void render() {
    }

    private void update() {
    }

    private void processInput() {
    }
}
