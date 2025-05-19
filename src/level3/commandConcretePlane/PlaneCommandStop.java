package level3.commandConcretePlane;

import level3.commandBase.CommandBase;
import level3.vehicles.Plane;

public class PlaneCommandStop implements CommandBase {
    private Plane plane;

    public PlaneCommandStop(Plane plane) {
        this.plane = plane;
    }

    @Override
    public void execute(){
        System.out.println("PlaneCommandStop.execute(): Invoking stop() on Plane");
    }
    @Override
    public void undo(){
        System.out.println("PlaneCommandStop.undo(): Invoking start() on Plane");
    }
}
