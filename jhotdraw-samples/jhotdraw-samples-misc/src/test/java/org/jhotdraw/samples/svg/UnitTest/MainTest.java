package org.jhotdraw.samples.svg.UnitTest;

import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.*;

public class MainTest {

    // Unit tests on class SVGEllipseFigure
    //testfigure
    SVGRectFigure testfigure = new SVGRectFigure(1.0, 2.0, 3.0, 4.0);

    @Test
    public void constructorAndGetMethodsTest() {
        assertEquals(1.0, testfigure.getX(), 0.0);
        assertEquals(2.0, testfigure.getY(), 0.0);
        assertEquals(3.0, testfigure.getWidth(), 0.0);
        assertEquals(4.0, testfigure.getHeight(), 0.0);
    }

    @Test
    public void cloneRectangleTest(){
        SVGRectFigure cloneRectangle = testfigure.clone();
        assertEquals(cloneRectangle.getX(), testfigure.getX(), 0.0);
        assertEquals(cloneRectangle.getY(), testfigure.getY(), 0.0);
        assertEquals(cloneRectangle.getWidth(), testfigure.getWidth(), 0.0);
        assertEquals(cloneRectangle.getHeight(), testfigure.getHeight(), 0.0);
        assertNotEquals(cloneRectangle, testfigure);
    }

    @Test
    public void containsMethodTest(){
        Point2D.Double p = new Point2D.Double(1.5, 2.5);
        assertTrue(testfigure.contains(p));
    }
}
