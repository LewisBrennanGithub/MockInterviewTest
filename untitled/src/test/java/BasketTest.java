import static org.junit.Assert.assertEquals;

import models.Basket;
import models.Item;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {

    private Basket basket;
    private Item apple;
    private Item banana;

    @Before
    public void setUp() {
        basket = new Basket();

        apple = new Item("Apple", 1.0, true);
        banana = new Item("Banana", 2.0, false);
    }

    @Test
    public void testAddItem() {
        basket.addItem(apple, 3);
        basket.addItem(banana, 2);
        assertEquals(6.0, basket.calculateTotal(false), 0.0);
    }

    @Test
    public void testRemoveItem() {
        basket.addItem(apple, 3);
        basket.addItem(banana, 2);
        basket.removeItem(apple, 1);
        assertEquals(5.0, basket.calculateTotal(false), 0.0);
    }

    @Test
    public void testEmptyBasket() {
        basket.addItem(apple, 3);
        basket.addItem(banana, 2);
        basket.emptyBasket();
        assertEquals(0.0, basket.calculateTotal(false), 0.0);
    }

    @Test
    public void testCalculateTotalWithDiscounts() {
        basket.addItem(apple, 20);
        basket.addItem(banana, 3);
        assertEquals(15.68, basket.calculateTotal(true), 0.0);
    }
}
