package gameresources.pattern.decoupling.service_locator.v1_the_pattern;

import java.util.logging.Logger;

class LoggedAudio implements Audio {
    private final Audio wrapped;

    public LoggedAudio(Audio wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void playSound(int soundId) {
        Logger.getAnonymousLogger().fine("play sound");
        wrapped.playSound(soundId);
    }

    @Override
    public void stopSound(int soundId) {
        Logger.getAnonymousLogger().fine("stop sound");
        wrapped.stopSound(soundId);
    }

    @Override
    public void stopAllSounds() {
        Logger.getAnonymousLogger().fine("stop all sounds");
        wrapped.stopAllSounds();
    }
}
