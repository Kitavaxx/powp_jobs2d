package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Figure Jane 1":
				FiguresJane figuresJane1 = new FiguresJane(driverManager.getCurrentDriver());
				figuresJane1.figureScript1();
				break;
			case "Figure Jane 2":
				FiguresJane figuresJane2 = new FiguresJane(driverManager.getCurrentDriver());
				figuresJane2.figureScript2();
				break;
		}
	}
}
