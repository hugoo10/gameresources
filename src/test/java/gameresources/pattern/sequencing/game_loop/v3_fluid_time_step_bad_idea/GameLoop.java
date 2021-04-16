package gameresources.pattern.sequencing.game_loop.v3_fluid_time_step_bad_idea;

class GameLoop {
    public void gameLoop() throws InterruptedException {
        long lastTime = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();
            long elapsed = current - lastTime;
            processInput();
            update(elapsed);
            render();
            lastTime = current;
        }
        //PROBLEM: non deterministic and unstable
    }

    private void render() {
    }

    private void update(long elapsed) {
    }

    private void processInput() {
    }
}
