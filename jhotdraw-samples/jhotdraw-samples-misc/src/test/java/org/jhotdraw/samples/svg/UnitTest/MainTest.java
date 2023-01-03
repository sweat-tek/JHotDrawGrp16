package org.jhotdraw.samples.svg.UnitTest;


import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;
import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.*;

public class MainTest {
    //Setup for creating feature tracers.
    /*
    @Test
    public void testMain() {
        String[] args = {};
        Main.main(args);
        while (true){
        }
    }

     */

    // Unit tests on class SVGEllipseFigure
    //testfigure
    SVGEllipseFigure testfigure = new SVGEllipseFigure(1.0, 2.0, 3.0, 4.0);

    @Test
    public void constructorAndGetMethodsTest() {
        assertEquals(1.0, testfigure.getX(), 0.0);
        assertEquals(2.0, testfigure.getY(), 0.0);
        assertEquals(3.0, testfigure.getWidth(), 0.0);
        assertEquals(4.0, testfigure.getHeight(), 0.0);
    }

    @Test
    public void cloneEllipseTest(){
        SVGEllipseFigure cloneEllipse = testfigure.clone();
        assertEquals(cloneEllipse.getX(), testfigure.getX(), 0.0);
        assertEquals(cloneEllipse.getY(), testfigure.getY(), 0.0);
        assertEquals(cloneEllipse.getWidth(), testfigure.getWidth(), 0.0);
        assertEquals(cloneEllipse.getHeight(), testfigure.getHeight(), 0.0);
        assertNotEquals(cloneEllipse, testfigure);
    }

    @Test
    public void containsMethodTest(){
        //point in center of ellipse
        Point2D.Double p = new Point2D.Double(1.5, 2.5);
        assertTrue(testfigure.contains(p));



    }
}