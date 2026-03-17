package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

public class AbstractDriverAdapter extends AbstractDriver{
    private final Job2dDriver currentDriver;
    
    public AbstractDriverAdapter(Job2dDriver currentDriver) {
        super(0,0);
        this.currentDriver = currentDriver;
    }

    public void figureScript() {
        FiguresJane.figureScript(this);
    }

    @Override
    public void operateTo(int x, int y){
        currentDriver.operateTo(x, y);
    }

    @Override
    public String toString() {
        return "Abstract Driver Adapter";
    }
}
