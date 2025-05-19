package level3.commandConcreteBicycle;

import level3.commandBase.CommandBase;
import level3.vehicles.Bicycle;

public class BicycleMoveCommand implements CommandBase {
    private Bicycle bicycle;

    public BicycleMoveCommand(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void execute(){
        System.out.println("BicycleMoveCommand.execute(): Invoking move() on Bicycle");
    }
    @Override
    public void undo(){
        System.out.println("BicycleMoveCommand.undo(): Invoking stop() on Bicycle");
    }
}
