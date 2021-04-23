package gameresources.pattern.optimization.data_locality.v2_with_component_list;

import java.util.ArrayList;
import java.util.List;

class Game {
    private List<GameEntity> entities = new ArrayList<>();

    private List<PhysicsComponent> physics = new ArrayList<>();
    private List<RenderComponent> renders = new ArrayList<>();
    private List<AIComponent> ais = new ArrayList<>();

    public void gameLoop() {
        //full cache miss
        boolean gameOver = false;
        while (!gameOver) {
            for (int i = 0; i < ais.size(); ++i) {
                ais.get(i).update();
            }
            for (int i = 0; i < physics.size(); ++i) {
                physics.get(i).update();
            }
            for (int i = 0; i < renders.size(); ++i) {
                renders.get(i).render();
            }
        }
    }
}
