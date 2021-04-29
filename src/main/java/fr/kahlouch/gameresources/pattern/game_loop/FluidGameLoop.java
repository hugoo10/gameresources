package fr.kahlouch.gameresources.pattern.game_loop;

public abstract class FluidGameLoop extends GameLoop{

    @Override
    protected final void gameStep(long currentTimeNano, long elapsedNano) {
        processInput();
        update(elapsedNano);
        render();
    }

    protected abstract void render();

    protected abstract void update(long elapsedNano);

    protected abstract void processInput();
}
