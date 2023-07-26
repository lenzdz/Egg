package TempConverterTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tempconverter.entities.Temperature;
import tempconverter.services.TempConverterServices;

public class TempConverterTest {
    
    public TempConverterTest() {
    }
    
    TempConverterServices servTempConv;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        servTempConv = new TempConverterServices();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkConvertion() {
        assertEquals(32, servTempConv.convertTemp((new Temperature("C", 0)), "F"),0.001); // Celsius a Farenheit
        assertEquals(325.15, servTempConv.convertTemp((new Temperature("C", 52)), "K"),0.001); // Celsius a Kelvin
        assertEquals(100.058, servTempConv.convertTemp((new Temperature("K", 310.96)), "F"),0.001); // Kelvin a Farenheit
        assertEquals(114.05, servTempConv.convertTemp((new Temperature("K", 387.2)), "C"),0.001); // Kelvin a Celsius
        assertEquals(566.483, servTempConv.convertTemp((new Temperature("F", 560)), "K"),0.001); // Farenheit a Kelvin
        assertEquals(9.5, servTempConv.convertTemp((new Temperature("F", 49.1)), "C"),0.001); // Farenheit a Celsius
    }
}
