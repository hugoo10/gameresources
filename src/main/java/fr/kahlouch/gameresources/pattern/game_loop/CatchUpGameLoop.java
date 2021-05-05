package fr.kahlouch.gameresources.pattern.game_loop;

public abstract class CatchUpGameLoop extends DesiredFpsGameLoop {
    protected CatchUpGameLoop(float desiredFps) {
        super(desiredFps);
    }

    @Override
    protected final void gameStep(long currentTimeNano, long elapsedNano) {
        this.lag += elapsedNano;
        processInput();
        while (this.lag >= this.nanoPerFrame) {
            update();
            this.lag -= this.nanoPerFrame;
        }
        render();
    }

    protected abstract void render();

    protected abstract void update();

    protected abstract void processInput();
}
