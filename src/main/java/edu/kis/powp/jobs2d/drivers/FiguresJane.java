package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FiguresJane extends AbstractDriver{
    
    public FiguresJane(Job2dDriver driver) {
        super(driver);
    }

    public void figureScript1() {
        driver.setPosition(0, 0);
        driver.operateTo(100, 100);
        driver.operateTo(200, 0);
        driver.operateTo(0, 0);
    }

    public void figureScript2() {
        driver.setPosition(50, 50);
        driver.operateTo(150, 50);
        driver.operateTo(150, 150);
        driver.operateTo(50, 150);
        driver.operateTo(50, 50);
    }

    @Override
    public String toString() {
        return "Jane Figures";
    }
}
