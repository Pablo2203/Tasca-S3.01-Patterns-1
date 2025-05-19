package level3.commandConcreteCar;

import level3.commandBase.CommandBase;
import level3.vehicles.Car;

public class CarCommandStop implements CommandBase {
    private Car car;

    public CarCommandStop(Car car) {
        this.car = car;
    }

    @Override
    public void execute(){
        System.out.println("CarCommandStop.execute(): Invoking stop() on Car");
    }
    @Override
    public void undo(){
        System.out.println("CarCommandStop.undo(): Invoking move() on Car");
    }
}
