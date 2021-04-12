package gameresources.pattern.design.singleton.v3_global_hidden_static;


class MySingleton {
    private final static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton instance() {
        return instance;
    }
}
