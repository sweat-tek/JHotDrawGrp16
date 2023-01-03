package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.Stage;

import com.tngtech.jgiven.annotation.ProvidedScenarioState;

import org.jhotdraw.draw.DefaultDrawingView;

import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;



public class WhenCircle extends Stage<WhenCircle>{
    @ProvidedScenarioState
    DefaultDrawingView view;

    public WhenCircle circleIsDrawn(){
        SVGEllipseFigure ellipseFigure = new SVGEllipseFigure(1, 1, 1, 1);
        view.getDrawing().add(ellipseFigure);


        return self();
    }
}