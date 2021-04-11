package gameresources.pattern.design.command.v2_gameactor;

@FunctionalInterface
interface ICommand {
    void execute(GameActor gameActor);
}
