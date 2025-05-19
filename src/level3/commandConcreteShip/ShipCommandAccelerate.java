package level3.commandConcreteShip;

import level3.commandBase.CommandBase;
import level3.vehicles.Ship;

public class ShipCommandAccelerate implements CommandBase {
    private Ship ship;

    public ShipCommandAccelerate(Ship ship) {
        this.ship = ship;
    }
    @Override
    public void execute(){
        System.out.println("ShipCommandAccelerate.execute(): Invoking accelerate() on Ship");
    }
    @Override
    public void undo(){
        System.out.println("ShipCommandAccelerate.undo(): Invoking decelerate() on Ship");
    }
}
