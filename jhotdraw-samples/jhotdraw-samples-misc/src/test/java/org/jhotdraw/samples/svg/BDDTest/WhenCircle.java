package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.tool.CreationTool;
import org.jhotdraw.samples.svg.figures.SVGEllipseCreator;
import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;
import org.mockito.Mockito;

import java.awt.event.MouseEvent;
import java.util.HashMap;

import static org.mockito.Mockito.doReturn;


public class WhenCircle extends Stage<WhenCircle>{
    @ProvidedScenarioState
    DefaultDrawingView view;

    public WhenCircle circleIsDrawn(){
        SVGEllipseFigure ellipseFigure = new SVGEllipseFigure(1,1,1,1);
        view.getDrawing().add(ellipseFigure);


        return self();
    }
}