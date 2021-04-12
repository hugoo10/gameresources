package gameresources.pattern.design.singleton.v6_from_already_global;

import org.junit.jupiter.api.Test;

class Example {

    @Test
    public void test(){
        Game.instance().getLog().fine("OK");
    }
}
