package gameresources.pattern.decoupling.service_locator.v1_the_pattern;

class NullAudio implements Audio {
    @Override
    public void playSound(int soundId) {

    }

    @Override
    public void stopSound(int soundId) {

    }

    @Override
    public void stopAllSounds() {

    }
}
