import junit.framework.TestCase;

public class Task1Test extends TestCase {

    public void testTwoPlusTwo() {
        assertEquals(4, new Task1().plus(2, 2));
    }
}