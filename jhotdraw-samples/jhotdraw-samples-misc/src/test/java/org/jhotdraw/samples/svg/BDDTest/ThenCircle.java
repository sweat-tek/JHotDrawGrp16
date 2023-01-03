package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ThenCircle extends Stage<ThenCircle>{

    @ProvidedScenarioState
    DefaultDrawingView view;
    public ThenCircle thereIsACircleOnTheDrawing(){
        List<Figure> figuresOnDrawing = view.getDrawing().getFiguresFrontToBack();
        assertEquals(1, figuresOnDrawing.size());
        System.out.println(figuresOnDrawing.get(0).getClass());

        return self();
    }
}