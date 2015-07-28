import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testAreaWhenPositiveParameteres() throws Exception
    {
        Shape rect = new Rectangle(10.0d,20.0d);
        assertEquals(200.0d,rect.area(),2);
    }

    @Test
    public void testAreaWhenNegativeParameteres() throws Exception
    {
        Shape rect = new Rectangle(-10.0d,20.0d);
        assertEquals(0,rect.area(),2);
    }
}