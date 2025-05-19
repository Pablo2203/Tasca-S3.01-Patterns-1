package level3;

import level3.commandBase.CommandBase;
import level3.commandConcreteCar.CarMoveCommand;
import level3.commandConcreteCar.CarCommandAccelerate;
import level3.commandConcreteCar.CarCommandStop;
import level3.invoker.Engine;
import level3.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car car=new Car();

        CommandBase carMoveCommand=new CarMoveCommand(car);

        engine.on(carMoveCommand);

        CommandBase carStopCommand=new CarCommandStop(car);

        engine.off(carStopCommand);

        engine.on(new CarCommandAccelerate(car));



    }
}