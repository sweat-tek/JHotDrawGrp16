package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;

import java.util.List;


public class ThenCircle extends Stage<ThenCircle>{

    @ProvidedScenarioState
    DefaultDrawingView view;
    public ThenCircle thereIsACircleOnTheDrawing(){
        List<Figure> figuresOnDrawing = view.getDrawing().getFiguresFrontToBack();
        System.out.println(figuresOnDrawing.size());
        return self();

    }
}