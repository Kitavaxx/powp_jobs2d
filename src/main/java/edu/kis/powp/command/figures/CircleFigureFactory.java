package edu.kis.powp.command.figures;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CircleFigureFactory {

    public static DriverCommand createCircle(Job2dDriver driver) {
        int centerX = 0;
        int centerY = 0;
        int radius = 100;
        
        ComplexCommand circle = new ComplexCommand(
            new SetPositionCommand(centerX + radius, centerY)
        );

        for (int i = 1; i <= 36; i++) {
            double angle = Math.toRadians(i * 10);
            int x = centerX + (int)(radius * Math.cos(angle));
            int y = centerY + (int)(radius * Math.sin(angle));
            circle.addCommand(new OperateToCommand(x, y));
        }
        
        circle.setDriver(driver);
        
        return circle;
    }
}