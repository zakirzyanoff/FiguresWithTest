package model.triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RightTriangleTest extends TriangleTest{


    @Before
    public void setUp() throws Exception{
       triangle = new RightTriangle(3,4,5);
    }

    @Override
    public void getPerimeterTest() {
        assertEquals(12, triangle.getPerimeter(),0);
    }

    @Override
    public void getSquareTest() {
        assertEquals(6,triangle.getSquare(),0);
    }

    @Override
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void constructorErrorTest() {
        triangle = new RightTriangle(3,4,6);
    }

    @Test
    public void getInfoTest() {
        assertEquals("Прямоугольный треугольник с катетами 3.0 и 4.0 и гипотенузой 5.0", triangle.getInfo());

    }
}