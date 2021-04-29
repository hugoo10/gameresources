package fr.kahlouch.gameresources.pattern.game_loop;

import javafx.animation.AnimationTimer;

abstract class GameLoop {
    private long previousTimeNano = -1;

    public final void start() {
        new AnimationTimer() {
            @Override
            public void handle(long currentTimeNano) {
                if (previousTimeNano > -1) {
                    gameStep(currentTimeNano, currentTimeNano - previousTimeNano);
                }
                previousTimeNano = currentTimeNano;
            }
        }.start();
    }

    protected abstract void gameStep(long currentTimeNano, long elapsedNano);
}
