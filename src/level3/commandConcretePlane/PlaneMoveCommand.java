package level3.commandConcretePlane;

import level3.commandBase.CommandBase;
import level3.vehicles.Plane;

public class PlaneMoveCommand implements CommandBase {
    private Plane plane;

    public PlaneMoveCommand(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void execute(){
        System.out.println("PlaneMoveCommand.execute(): Invoking move() on Plane");
    }
    @Override
    public void undo(){
        System.out.println("PlaneMoveCommand.undo(): Invoking stop() on Plane");
    }
}
