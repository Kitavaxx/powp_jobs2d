package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands = new ArrayList<>();

    public void setDriver(Job2dDriver driver){
        for(DriverCommand command : commands){
            command.setDriver(driver);
        }
    }

    public ComplexCommand(DriverCommand command){
        commands.add(command);
    }
    
    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    public void execute(){
        for(DriverCommand command : commands){
            command.execute();
        }
    }
}
