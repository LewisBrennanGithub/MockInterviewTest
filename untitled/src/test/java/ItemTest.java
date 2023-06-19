import static org.junit.Assert.assertEquals;

import models.Item;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {
    private Item item;

    @Before
    public void setUp() {
        item = new Item("Apple", 0.5, true);
    }
    @Test
    public void testGetName() {
        assertEquals("Apple", item.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(0.5, item.getPrice(), 0.001);
    }

    @Test
    public void testIsBuyOneGetOneFreeEligible() {
        assertEquals(true, item.isBuyOneGetOneFreeEligible());
    }

    @Test
    public void testSetName() {
        item.setName("Banana");
        assertEquals("Banana", item.getName());
    }

    @Test
    public void testSetPrice() {
        item.setPrice(0.7);
        assertEquals(0.7, item.getPrice(), 0.001);
    }

    @Test
    public void testSetBuyOneGetOneFreeEligible() {
        item.setBuyOneGetOneFreeEligible(false);
        assertEquals(false, item.isBuyOneGetOneFreeEligible());
    }
}
