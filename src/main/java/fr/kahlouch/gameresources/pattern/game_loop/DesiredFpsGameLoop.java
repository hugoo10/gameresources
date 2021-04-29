package fr.kahlouch.gameresources.pattern.game_loop;

abstract class DesiredFpsGameLoop extends GameLoop {
    protected final long nanoPerFrame;
    protected long lag;

    protected DesiredFpsGameLoop(int desiredFps) {
        this.nanoPerFrame = 1_000_000_000 / desiredFps;
        this.lag = 0;
    }
}
