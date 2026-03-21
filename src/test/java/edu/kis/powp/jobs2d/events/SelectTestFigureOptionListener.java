package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {
	public final String FIGURE_JOE_1 = "Figure Joe 1";
    public final String FIGURE_JOE_2 = "Figure Joe 2";
    public final String FIGURE_JANE = "Figure Jane";

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case FIGURE_JANE:
				AbstractDriverAdapter figuresJane1 = new AbstractDriverAdapter(driverManager.getCurrentDriver());
				figuresJane1.figureScript();
				break;
		}
	}
}
