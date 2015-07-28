import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testArea() throws Exception
    {
        Rectangle rect = new Rectangle(10.0d,20.0d);
        assertEquals(200.0d,rect.area());
    }
}