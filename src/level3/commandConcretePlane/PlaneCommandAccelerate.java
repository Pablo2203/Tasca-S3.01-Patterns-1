package level3.commandConcretePlane;

import level3.commandBase.CommandBase;
import level3.vehicles.Plane;

public class PlaneCommandAccelerate implements CommandBase {
    private Plane plane;

    public PlaneCommandAccelerate(Plane plane) {
        this.plane = plane;
    }
    @Override
    public void execute(){
        System.out.println("PlaneCommandAccelerate.execute(): Invoking accelerate() on Plane");
    }
    @Override
    public void undo(){
        System.out.println("PlaneCommandAccelerate.undo(): Invoking decelerate() on Plane");
    }
}
