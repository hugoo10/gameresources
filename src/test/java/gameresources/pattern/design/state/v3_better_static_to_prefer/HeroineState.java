package gameresources.pattern.design.state.v3_better_static_to_prefer;

interface HeroineState {
    StandingState standing = new StandingState();
    DuckingState ducking = new DuckingState();
    JumpingState jumping = new JumpingState();
    DivingState diving = new DivingState();

    void handleInput(Heroine heroine, String input);

    void update(Heroine heroine);
}
