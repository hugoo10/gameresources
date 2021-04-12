package gameresources.pattern.design.state.v7_hierarchical;

interface HeroineState {
    StandingState standing = new StandingState();
    DuckingState ducking = new DuckingState();
    JumpingState jumping = new JumpingState();
    DivingState diving = new DivingState();

    void handleInput(Heroine heroine, String input);

    void update(Heroine heroine);
}
