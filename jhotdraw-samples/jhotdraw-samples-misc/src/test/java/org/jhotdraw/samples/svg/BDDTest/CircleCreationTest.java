package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;


public class CircleCreationTest extends ScenarioTest<GivenCircle, WhenCircle, ThenCircle> {

    @Test
    public final void creatingACircle() {
        given().anEmptyDrawing();

        when().circleIsDrawn();

        then().thereIsACircleOnTheDrawing();


    }


}

