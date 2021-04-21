package gameresources.pattern.decoupling.event_queue.v2_asynchronous;

class Audio {
    public static final int VOL_MAX = 100;
    private static final int MAX_PENDING = 16;
    private static PlayMessage[] pending = new PlayMessage[MAX_PENDING];
    private static int numPending;

    public static void init() {
        numPending = 0;
    }

    public static void playSound(SoundId id, int volume) {
        assert numPending < MAX_PENDING;
        pending[numPending++] = new PlayMessage(id, volume);
    }

    public static void update() {
        for (int i = 0; i < numPending; ++i) {
            ResourceId resource = loadSound(pending[i].id());
            int channel = findOpenChannel();
            if (channel == -1) return;
            startSound(resource, channel, pending[i].volume());
        }
        numPending = 0;
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
