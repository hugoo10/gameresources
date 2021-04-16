package gameresources.pattern.sequencing.game_loop.v1_simplest;

class GameLoop {
    
    public void gameLoop() {
        while(true) {
            processInput();
            update();
            render();
        }
        // PROBLEM: depends on processor speed
    }

    private void render() {
    }

    private void update() {
    }

    private void processInput() {
    }
}
