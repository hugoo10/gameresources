package gameresources.pattern.decoupling.event_queue.v1_simple_audio_engine;

class Audio {
    public static final int VOL_MAX = 100;
    public static void playSound(SoundId id, int volume) {
        ResourceId resource = loadSound(id);
        int channel = findOpenChannel();
        if(channel == -1) return;
        startSound(resource, channel, volume);
    }

    private static void startSound(ResourceId resource, int channel, int volume) {
    }

    private static ResourceId loadSound(SoundId id) {
        return new ResourceId();
    }

    private static int findOpenChannel() {
        return 0;
    }
}
