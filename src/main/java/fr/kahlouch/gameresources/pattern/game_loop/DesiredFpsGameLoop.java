package fr.kahlouch.gameresources.pattern.game_loop;

abstract class DesiredFpsGameLoop extends GameLoop {
    protected long nanoPerFrame;
    protected long lag;

    protected DesiredFpsGameLoop(float desiredFps) {
        setDesiredFps(desiredFps);
        this.lag = 0;
    }

    public void setDesiredFps(float desiredFps) {
        this.nanoPerFrame = Math.round(1_000_000_000D / desiredFps);
    }
}
