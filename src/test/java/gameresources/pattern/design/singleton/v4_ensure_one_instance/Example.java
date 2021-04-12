package gameresources.pattern.design.singleton.v4_ensure_one_instance;

import org.junit.jupiter.api.Test;

class Example {

    @Test
    public void test_ok() {
        new MySingleton();
    }

    @Test
    public void test_nok() {
        new MySingleton();
        new MySingleton();
    }
}
