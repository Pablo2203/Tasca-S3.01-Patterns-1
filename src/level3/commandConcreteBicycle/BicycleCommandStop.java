package level3.commandConcreteBicycle;

import level3.commandBase.CommandBase;
import level3.vehicles.Bicycle;

public class BicycleCommandStop implements CommandBase {
    private Bicycle bicycle;

    public BicycleCommandStop(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    @Override
    public void execute(){
        System.out.println("BicycleCommandStop.execute(): Invoking stop() on Bicycle");
    }
    @Override
    public void undo(){
        System.out.println("BicycleCommandStop.undo(): Invoking start() on Bicycle");
    }
}
