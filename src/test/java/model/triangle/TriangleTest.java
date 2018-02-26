package model.triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception{
        triangle =new Triangle(3,4,5);
    }

    @Test
    public void constructurSuccessTest(){
        assertNotNull(triangle);
    }


    @Test(expected = java.lang.IllegalArgumentException.class)
    public void constructorTest(){
        new Triangle(1,2,3);
    }

    @Test
    public void getPerimeter() {
        assertEquals(12,triangle.getPerimeter(),0);
    }

    @Test
    public void getInfo() {
        assertEquals("Треугольник со сторонами 3.0, 4.0, 5.0", triangle.getInfo());
    }
}