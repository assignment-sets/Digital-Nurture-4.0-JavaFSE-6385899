import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    public void setup() {
        cart = new ShoppingCart();
    }

    @AfterEach
    public void tearDown() {
        cart = null;
    }

    @Test
    public void addItemTest() {
        // arrange
        String item = "item1";

        // act
        boolean res = cart.addItem(item);

        // assert
        assertTrue(res, "Should return true when an item is added successfully");
        assertEquals(1, cart.getItemCount(), "Cart should contain 1 item after adding one");
        assertFalse(cart.isEmpty(), "Cart should not be empty after adding an item");
    }

    @Test
    public void clearCartTest() {
        // arrange
        cart.addItem("item1");
        cart.addItem("item2");
        cart.addItem("item3");

        // act
        cart.clearCart();

        // assert
        assertEquals(0, cart.getItemCount(), "Cart should have 0 items after clearing");
        assertTrue(cart.isEmpty(), "Cart should be empty after clear");
    }

    @Test
    public void getItemCountTest() {
        // arrange
        cart.addItem("item1");
        cart.addItem("item2");

        // act
        int cnt = cart.getItemCount();

        // assert
        assertEquals(2, cnt, "Cart should contain 2 item");
        assertFalse(cart.isEmpty(), "Cart should not be empty");
    }

    @Test
    public void isEmptyTest() {
        // act
        boolean resEmpty = cart.isEmpty();

        // assert
        assertTrue(resEmpty, "cart should be empty no item added");
    }
}
