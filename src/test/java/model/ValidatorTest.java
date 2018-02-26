package model;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class ValidatorTest {

    Validator validator;
    @Before
    public void setUp() throws Exception {
        validator=new Validator();
    }

    @Test
    public void validateTriangle() throws Exception{
        assertTrue(validator.validateTriangle(3,4,5));
        assertFalse(validator.validateTriangle(3,4,7));
        assertFalse(validator.validateTriangle(3,8,5));
        assertFalse(validator.validateTriangle(9,4,5));
    }

    @Test
    public void validateDouble() throws Exception{
        assertTrue(validator.validateDouble(1));
        assertFalse(validator.validateDouble(0));
        assertFalse(validator.validateDouble(-1));
        assertFalse(validator.validateDouble(Double.NaN));
        assertFalse(validator.validateDouble(Double.NEGATIVE_INFINITY));
        assertFalse(validator.validateDouble(Double.POSITIVE_INFINITY));
    }

    @Test
    public void validateTriangleSide() throws Exception{
        assertTrue(validator.validateTriangle(3,4,5));
        assertFalse(validator.validateTriangle(0,4,5));
        assertFalse(validator.validateTriangle(3,-1,5));
        assertFalse(validator.validateTriangle(3,4,Double.NaN));
    }
}