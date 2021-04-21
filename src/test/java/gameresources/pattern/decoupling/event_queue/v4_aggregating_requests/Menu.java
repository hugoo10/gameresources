package gameresources.pattern.decoupling.event_queue.v4_aggregating_requests;

import static gameresources.pattern.decoupling.event_queue.v4_aggregating_requests.Audio.VOL_MAX;

class Menu {
    public void onSelect(int index) {
        Audio.playSound(SoundId.SOUND_BLOOP, VOL_MAX);
        // etc...
    }
}
