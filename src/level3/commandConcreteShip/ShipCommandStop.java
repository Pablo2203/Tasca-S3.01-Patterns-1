package level3.commandConcreteShip;

import level3.commandBase.CommandBase;
import level3.vehicles.Ship;

public class ShipCommandStop implements CommandBase {
    private Ship ship;

    public ShipCommandStop(Ship ship) {
        this.ship = ship;
    }

    @Override
    public void execute(){
        System.out.println("ShipCommandStop.execute(): Invoking stop() on Ship");
    }
    @Override
    public void undo(){
        System.out.println("ShipCommandStop.undo(): Invoking start() on Ship");
    }
}
