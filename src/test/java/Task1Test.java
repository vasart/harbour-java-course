import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test extends TestCase {

    public Task1Test() {
    }

    @Test
    void twoPlusTwo() {
        assertEquals(4, new Task1().plus(2,2));
    }
}
