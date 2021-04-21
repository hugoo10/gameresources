package gameresources.pattern.decoupling.event_queue.v3_ring_buffer;

import static gameresources.pattern.decoupling.event_queue.v3_ring_buffer.Audio.VOL_MAX;

class Menu {
    public void onSelect(int index) {
        Audio.playSound(SoundId.SOUND_BLOOP, VOL_MAX);
        // etc...
    }
}
