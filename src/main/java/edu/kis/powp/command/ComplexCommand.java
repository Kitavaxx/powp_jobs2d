package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(DriverCommand command){
        commands.add(command);
    }

    public void execute(){
        for(DriverCommand command : commands){
            command.execute();
        }
    }
}
