package gameresources.pattern.sequencing.update_method.v3_fix_dead_issues;

class World {
    private static final int MAX_ENTITIES = 100;
    private int numEntities;
    private Entity[] entities = new Entity[MAX_ENTITIES];

    public void gameLoop() {
        while (true) {
            processInput();
            update();
            render();
        }
    }

    private void render() {
    }

    private void update() {
        for (int i = 0; i < numEntities; ++i) {
            this.entities[i].update();
        }
    }

    private void processInput() {
    }
}
