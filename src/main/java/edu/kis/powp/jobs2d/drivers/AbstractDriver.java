package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

abstract class AbstractDriver implements Job2dDriver {
    public static Job2dDriver driver;

    public AbstractDriver(Job2dDriver driver){
        this.driver = driver;
    }

    @Override
    public void setPosition(int x, int y){
        driver.setPosition(x, y);

    }

    @Override
    public void operateTo(int x, int y){
        this.operateTo(x, y);
    }
}
