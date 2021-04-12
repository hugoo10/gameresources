package gameresources.pattern.design.singleton.v5_access_through_inheritance;

class Enemy extends GameObject {
    void doSomething() {
        getLog().fine("I can log!");
    }
}
