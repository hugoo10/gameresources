package gameresources.pattern.design.command.v2_gameactor;


class JumpCommand implements ICommand {
    public void execute(GameActor gameActor) {
        gameActor.jump();
    }
}
