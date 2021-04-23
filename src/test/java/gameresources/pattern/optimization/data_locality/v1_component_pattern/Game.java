package gameresources.pattern.optimization.data_locality.v1_component_pattern;

import java.util.ArrayList;
import java.util.List;

class Game {
    private List<GameEntity> entities = new ArrayList<>();

    public void gameLoop() {
        //full cache miss
        boolean gameOver = false;
        while (!gameOver) {
            for (int i = 0; i < entities.size(); ++i) {
                entities.get(i).getAi().update();
            }
            for (int i = 0; i < entities.size(); ++i) {
                entities.get(i).getPhysics().update();
            }
            for (int i = 0; i < entities.size(); ++i) {
                entities.get(i).getRender().render();
            }
        }
    }
}
