package gameresources.pattern.decoupling.event_queue.v2_asynchronous;

import static gameresources.pattern.decoupling.event_queue.v1_simple_audio_engine.Audio.VOL_MAX;

class Menu {
    public void onSelect(int index) {
        Audio.playSound(SoundId.SOUND_BLOOP, VOL_MAX);
        // etc...
    }
}
