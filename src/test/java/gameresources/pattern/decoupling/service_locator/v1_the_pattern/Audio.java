package gameresources.pattern.decoupling.service_locator.v1_the_pattern;

interface Audio {
    void playSound(int soundId);

    void stopSound(int soundId);

    void stopAllSounds();
}
