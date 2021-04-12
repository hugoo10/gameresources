package gameresources.pattern.design.state.v6_concurrent;

class UnarmedState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("A".equals(input)) {
            return new ArmedState();
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }

    @Override
    public void enter(Heroine heroine) {
        //remove weapon
    }
}
