package gameresources.pattern.sequencing.game_loop.v6_fix_lag;

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
            render(lag / MS_PER_FRAME);

        }
        //PROBLEM: can be wrong extrapolation
    }

    private void render(long normalizeElapsedTime) {
    }

    private void update() {
    }

    private void processInput() {
    }
}
