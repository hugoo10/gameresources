package gameresources.pattern.decoupling.event_queue.v2_asynchronous;


import static gameresources.pattern.decoupling.event_queue.v2_asynchronous.Audio.VOL_MAX;

class Menu {
    public void onSelect(int index) {
        Audio.playSound(SoundId.SOUND_BLOOP, VOL_MAX);
        // etc...
    }
}
