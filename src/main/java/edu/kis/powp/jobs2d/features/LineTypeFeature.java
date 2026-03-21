package edu.kis.powp.jobs2d.features;
import edu.kis.powp.appbase.Application;
import edu.kis.powp.jobs2d.events.SelectLineTypeOptionListener;
import edu.kis.legacy.drawer.shape.ILine;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LineTypeFeature {
    private static Application app;
    private static String currentLineType = "basic";
    private static final Map<String, Supplier<ILine>> lineCreators = new HashMap<>();

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
    

    public static void addLineType(String name, String type, Supplier<ILine> creator){
        lineCreators.put(type, creator);
        SelectLineTypeOptionListener listener = new SelectLineTypeOptionListener(type);
        app.addComponentMenuElement(LineTypeFeature.class, name,
            listener);
    }

    public static ILine createCurrentLine(){
        Supplier<ILine> creator = lineCreators.get(currentLineType);
        return creator.get();
    }
}