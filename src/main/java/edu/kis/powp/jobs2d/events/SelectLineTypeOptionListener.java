package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.features.LineTypeFeature;

public class SelectLineTypeOptionListener implements ActionListener {
    private String lineType;

    public SelectLineTypeOptionListener(String lineType){
        this.lineType = lineType;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        LineTypeFeature.setCurrentLineType(lineType);
        LineTypeFeature.updateLineTypeInfo();
	}
}
