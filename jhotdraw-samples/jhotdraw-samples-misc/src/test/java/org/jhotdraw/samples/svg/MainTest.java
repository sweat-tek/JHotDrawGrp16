package org.jhotdraw.samples.svg;


import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
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
    SVGEllipseFigure testfigure = new SVGEllipseFigure(1.0,2.0,3.0,4.0);

    @Test
    public void constructorAndGetMethodsTest() {
        assertEquals(1.0, testfigure.getX(), 0.0);
        assertEquals(2.0, testfigure.getY(),0.0);
        assertEquals(3.0,testfigure.getWidth(),0.0);
        assertEquals(4.0,testfigure.getHeight(),0.0);
    }

    @Test
    public void cloneEllipseTest(){
        SVGEllipseFigure cloneEllipse = testfigure.clone();
        assertEquals(cloneEllipse.getX(), testfigure.getX(), 0.0);
        assertEquals(cloneEllipse.getY(), testfigure.getY(),0.0);
        assertEquals(cloneEllipse.getWidth(),testfigure.getWidth(),0.0);
        assertEquals(cloneEllipse.getHeight(),testfigure.getHeight(),0.0);
        assertNotEquals(cloneEllipse, testfigure);
    }

    @Test
    public void anotherTest(){


    }
}