package fr.kahlouch.gameresources.pattern.game_loop;

public abstract class ExtrapolationGameLoop extends DesiredFpsGameLoop {
    protected ExtrapolationGameLoop(int desiredFps) {
        super(desiredFps);
    }

    @Override
    protected final void gameStep(long currentTimeNano, long elapsedNano) {
        lag += elapsedNano;
        processInput();
        while (lag >= this.nanoPerFrame) {
            update();
            lag -= this.nanoPerFrame;
        }
        render(lag / this.nanoPerFrame);
    }

    protected abstract void render(long normalizeelapsedNanoTime);

    protected abstract void update();

    protected abstract void processInput();
}
