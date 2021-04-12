package gameresources.pattern.design.singleton.v4_ensure_one_instance;


class MySingleton {
    private static boolean instantiated = false;

    public MySingleton() {
        assert !instantiated;
        instantiated = true;
    }
}
