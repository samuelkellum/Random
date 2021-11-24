import static org.junit.Assert.*;
import org.junit.jupiter.api.*;
import java.util.*;


public class HouseTests{
    private House h;

    @BeforeEach
    public void setUp(){
        h = new House("Amarillo", 3600000, 5, 6);
    }
    @Test
    public void testGetCity(){
        assertEquals("Amarillo", h.getCity());
    }

    @Test
    public void testGetPrice(){
        assertEquals(3600000, h.getPrice());
    }
    
    @Test
    public void testChangeCityName(){
        h.changeCityName("Denver");
        assertEquals("Denver", h.getCity());
    }

    @Test
    public void testChangePrice(){
        h.changePrice(100);
        assertEquals(3600100, h.getPrice());
    }

    @Test
    public void testSetPrice(){
        h.setPrice(1234567);
        assertEquals(1234567, h.getPrice());
    }

    @Test
    public void testChangeBedrooms(){
        h.changeBedrooms(-3);
        assertEquals(2, h.getBedrooms());
    }

    @Test
    public void testSetBedrooms(){
        h.setBedrooms(5);
        assertEquals(5, h.getBedrooms());
    }

    @Test
    public void testChangeBathrooms(){
        h.changeBathrooms(5);
        assertEquals(11, h.getBathrooms());
    }

    @Test
    public void testSetBathrooms(){
        h.setBathrooms(7);
        assertEquals(7, h.getBathrooms());
    }


}