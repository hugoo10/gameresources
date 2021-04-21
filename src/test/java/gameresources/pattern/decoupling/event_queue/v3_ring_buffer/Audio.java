package gameresources.pattern.decoupling.event_queue.v3_ring_buffer;

class Audio {
    public static final int VOL_MAX = 100;
    private static final int MAX_PENDING = 16;
    private static PlayMessage[] pending = new PlayMessage[MAX_PENDING];
    private static int head;
    private static int tail;

    public static void init() {
        head = 0;
        tail = 0;
    }

    public static void playSound(SoundId id, int volume) {
        assert (tail + 1) % MAX_PENDING != head;
        pending[tail] = new PlayMessage(id, volume);
        tail = (tail + 1) % MAX_PENDING;
    }

    public static void update() {
        if (head == tail) return;

        ResourceId resource = loadSound(pending[head].id());
        int channel = findOpenChannel();
        if (channel == -1) return;
        startSound(resource, channel, pending[head].volume());

        head = (head + 1) % MAX_PENDING;
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
