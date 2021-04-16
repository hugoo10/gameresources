package gameresources.pattern.sequencing.update_method.v1_simple_patrol;

class GameLoop {

    public void gameLoop() {
        Entity skeleton = new Entity();
        boolean patrollingLeft = false;
        double x = 0;
        while (true) {
            if (patrollingLeft) {
                x--;
                if (x == 0) patrollingLeft = false;
            } else {
                x++;
                if (x == 100) patrollingLeft = true;
            }
            skeleton.setX(x);

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
