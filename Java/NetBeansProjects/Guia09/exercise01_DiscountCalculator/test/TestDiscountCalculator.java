import discountCalculator.entities.Discount;
import discountCalculator.services.DiscountServices;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDiscountCalculator {
    
    public TestDiscountCalculator() {
    }
    
    DiscountServices servDiscount;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        servDiscount = new DiscountServices();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void checkFinalPrice() {
        assertEquals(90, servDiscount.calculateDiscount(new Discount(100,10)), 0);
        assertEquals(478.8, servDiscount.calculateDiscount(new Discount(532,10)), 0);
        assertEquals(60.83, servDiscount.calculateDiscount(new Discount(79,23)), 0);
    }
}
