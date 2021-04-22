package gameresources.pattern.decoupling.service_locator.v1_the_pattern;

class Locator {
    private static Audio service_;
    private static NullAudio nullAudio = new NullAudio();

    public static void initialize() {
        service_ = nullAudio;
    }

    public static void provide(Audio service) {
        if (service == null) {
            service_ = nullAudio;
        } else {
            service_ = service;
        }
    }

    public static Audio getAudio() {
        return service_;
    }
}
