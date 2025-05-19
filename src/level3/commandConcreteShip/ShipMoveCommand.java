package level3.commandConcreteShip;

import level3.commandBase.CommandBase;
import level3.vehicles.Ship;

public class ShipMoveCommand implements CommandBase {
    private Ship ship;

    public ShipMoveCommand(Ship ship) {
        this.ship = ship;
    }
    @Override
    public void execute(){
        System.out.println("ShipMoveCommand.execute(): Invoking move() on Ship");
    }
    @Override
    public void undo(){
        System.out.println("ShipMoveCommand.undo(): Invoking stop() on Ship");
    }
}
