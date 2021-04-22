package gameresources.pattern.decoupling.service_locator.v1_the_pattern;

import org.junit.jupiter.api.Test;

class Example {
    private static final int VERY_LOUD_BANG = 1;

    @Test
    public void test() {
        ConsoleAudio audio = new ConsoleAudio();
        Locator.provide(audio);
        Audio audio1 = Locator.getAudio();
        audio1.playSound(VERY_LOUD_BANG);
    }

    public void enableAudioLogging() {
        Audio service = new LoggedAudio(Locator.getAudio());
        Locator.provide(service);
    }
}
