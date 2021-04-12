package gameresources.pattern.design.state.v6_concurrent;

class ArmedState implements HeroineState {
    @Override
    public HeroineState handleInput(Heroine heroine, String input) {
        if ("A".equals(input)) {
            return new UnarmedState();
        } else if("B".equals(input)) {
            //heroin.shoot
        }
        return null;
    }

    @Override
    public void update(Heroine heroine) {
    }

    @Override
    public void enter(Heroine heroine) {
        //add weapon
    }
}
