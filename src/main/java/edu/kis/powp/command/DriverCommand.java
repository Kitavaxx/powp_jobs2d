package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface DriverCommand{

    public void setDriver(Job2dDriver driver);

    public void execute();
}
