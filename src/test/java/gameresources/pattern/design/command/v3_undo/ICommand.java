package gameresources.pattern.design.command.v3_undo;

interface ICommand {
    void execute();

    void undo();
}
