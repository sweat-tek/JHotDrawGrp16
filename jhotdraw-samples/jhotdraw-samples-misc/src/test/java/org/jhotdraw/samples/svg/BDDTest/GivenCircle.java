package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;


public class GivenCircle extends Stage<GivenCircle> {

    @ProvidedScenarioState
    DefaultDrawingView view;


    public GivenCircle anEmptyDrawing() {
        view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        return self();
    }



}
