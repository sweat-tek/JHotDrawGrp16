package org.jhotdraw.samples.svg.BDDTest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;


public class CircleCreationTest extends ScenarioTest<GivenCircle, WhenCircle, ThenCircle> {

@Test
    public void creatingACircle() {
        given().someState();

        when().someAction();

        then().some_outcome();


    }


}

