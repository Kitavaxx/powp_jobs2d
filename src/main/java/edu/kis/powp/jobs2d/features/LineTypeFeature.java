package edu.kis.powp.jobs2d.features;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectLineTypeOptionListener;

public class LineTypeFeature {
    private static Application app;
    private static String currentLineType = "basic";

    public static void setupLinePlugin(Application application){
        app = application;
        app.addComponentMenu(LineTypeFeature.class, "Line Types");
    }

    public static String getCurrentLineType() {
        return currentLineType;
    }

    public static void updateLineTypeInfo() {
        app.updateInfo("Current Line Type: " + currentLineType);
    }

    public static void setCurrentLineType(String lineType){
        currentLineType = lineType;
        updateLineTypeInfo();
    }
    

    public static void addLineType(String name, String type){
        SelectLineTypeOptionListener listener = new SelectLineTypeOptionListener(type);
        app.addComponentMenuElement(LineTypeFeature.class, name,
            listener);
    }
}