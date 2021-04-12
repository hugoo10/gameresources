package gameresources.pattern.design.state.v5_split_graphic;

interface HeroineState {
    HeroineState handleInput(Heroine heroine, String input);

    void update(Heroine heroine);

    void enter(Heroine heroine);
}
