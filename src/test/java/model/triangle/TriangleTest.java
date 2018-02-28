package model.triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    protected Triangle triangle;

    @Before
    public void setUp() throws Exception{
        triangle =new Triangle(3,4,5);
    }

    @Test
    public void constructorSuccessTest(){
        assertNotNull(triangle);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void constructorErrorTest(){
        new Triangle(1,2,3);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void constructorTest(){
        new Triangle(1,2,3);
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(9.0,triangle.getPerimeter(),0);
    }

    @Test
    public void getInfoTest() {
        assertEquals("Треугольник со сторонами 3.0, 4.0, 5.0", triangle.getInfo());
    }

    @Test
    public void getSquareTest(){
        assertEquals(2.9047375096555625, triangle.getPerimeter(),0);
    }
}