package gameresources.pattern.design.state.v4_better_instanciated;

interface HeroineState {
    HeroineState handleInput(Heroine heroine, String input);

    void update(Heroine heroine);
}
