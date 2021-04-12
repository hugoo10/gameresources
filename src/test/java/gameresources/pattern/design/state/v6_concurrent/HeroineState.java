package gameresources.pattern.design.state.v6_concurrent;

interface HeroineState {
    HeroineState handleInput(Heroine heroine, String input);

    void update(Heroine heroine);

    void enter(Heroine heroine);
}
