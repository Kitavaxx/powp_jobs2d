package edu.kis.powp.command.figures;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleFigureFactory {

    public static DriverCommand createRectangle(Job2dDriver driver){
        ComplexCommand rectangle = new ComplexCommand(
            new SetPositionCommand(0, 0)
        );
        rectangle.addCommand(new OperateToCommand(100, 0));
        rectangle.addCommand(new OperateToCommand(100, 100));
        rectangle.addCommand(new OperateToCommand(0, 100));
        rectangle.addCommand(new OperateToCommand(0, 0));

        rectangle.setDriver(driver);
        return rectangle;
    }
}
