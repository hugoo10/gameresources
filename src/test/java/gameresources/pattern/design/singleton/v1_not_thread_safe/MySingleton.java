package gameresources.pattern.design.singleton.v1_not_thread_safe;


class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton instance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
