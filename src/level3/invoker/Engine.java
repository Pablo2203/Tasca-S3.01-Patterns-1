package level3.invoker;

import level3.commandBase.CommandBase;

public class Engine {
    CommandBase onCommand, offCommand, undoCommand;

    public void on(CommandBase onCommand) {
        onCommand.execute();
        undoCommand = onCommand;
    }
    public void off(CommandBase offCommand) {
        offCommand.execute();
        undoCommand = offCommand;
    }
    public void undo() {
        undoCommand.undo();
    }



}
