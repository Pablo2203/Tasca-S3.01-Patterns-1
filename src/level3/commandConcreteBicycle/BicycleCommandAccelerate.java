package level3.commandConcreteBicycle;

import level3.commandBase.CommandBase;
import level3.vehicles.Bicycle;

public class BicycleCommandAccelerate implements CommandBase {
    private Bicycle bicycle;

    public BicycleCommandAccelerate(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    @Override
    public void execute(){
        System.out.println("BicycleCommandAccelerate.execute(): Invoking accelerate() on Bicycle");
    }
    @Override
    public void undo(){
        System.out.println("BicycleCommandAccelerate.undo(): Invoking decelerate() on Bicycle");
    }
}
