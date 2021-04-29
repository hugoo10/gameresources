package fr.kahlouch.gameresources.pattern.game_loop;

public abstract class SimpleGameLoop extends GameLoop {

    @Override
    protected final void gameStep(long currentTimeNano, long elapsedNano) {
        processInput();
        update();
        render();
    }

    protected abstract void render();

    protected abstract void update();

    protected abstract void processInput();
}
