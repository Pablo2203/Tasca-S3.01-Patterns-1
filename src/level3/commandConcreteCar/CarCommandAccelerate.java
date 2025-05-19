package level3.commandConcreteCar;

import level3.commandBase.CommandBase;
import level3.vehicles.Car;

public class CarCommandAccelerate implements CommandBase {
    private Car car;

    public CarCommandAccelerate(Car car) {
        this.car = car;
    }

    @Override
    public void execute(){
        System.out.println("CarCommandAccelerate.execute(): Invoking accelerate() on Car");
    }
    @Override
    public void undo(){
        System.out.println("CarCommandAccelerate.undo(): Invoking decelerate() on Car");
    }

}
