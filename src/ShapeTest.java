import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    @Test
    public void testAreaOfRectangleWhenPositiveParameteres() throws Exception
    {
        Shape rect = new Rectangle(10.0d,20.0d);
        assertEquals(200.0d,rect.area(),2);
    }

    @Test
    public void testAreaOfRectangleWhenNegativeParameteres() throws Exception
    {
        Shape rect = new Rectangle(-10.0d,20.0d);
        assertEquals(0,rect.area(),2);
    }

    @Test
    public void testPerimeterOfRectangleWhenPositiveParameteres() throws Exception
    {
        Shape rect = new Rectangle(10.0d,20.0d);
        assertEquals(60.0d,rect.perimeter(),2);
    }

    @Test
    public void testPerimeterOfRectangleWhenNegativeParameteres() throws Exception
    {
        Shape rect = new Rectangle(-10.0d,20.0d);
        assertEquals(0,rect.perimeter(),2);
    }

    @Test
    public void testAreaOfSquareWhenPositiveParameteres() throws Exception
    {
        Shape square = new Square(10.0d);
        assertEquals(100.0d,square.area(),2);
    }

    @Test
    public void testAreaOfSquareWhenNegativeParameteres() throws Exception
    {
        Shape square = new Square(-10.0d);
        assertEquals(0,square.area(),2);
    }

    @Test
    public void testPerimeterOfSquareWhenPositiveParameteres() throws Exception
    {
        Shape square = new Square(10.0d);
        assertEquals(40.0d,square.perimeter(),2);
    }

    @Test
    public void testPerimeterOfSquareWhenNegativeParameteres() throws Exception
    {
        Shape square = new Square(-10.0d);
        assertEquals(0,square.perimeter(),2);
    }

    @Test
    public void testAreaOfCircleWhenPositiveParameteres() throws Exception
    {
        Shape circle = new Circle(10.0d);
        assertEquals(314.0d,circle.area(),2);
    }

    @Test
    public void testAreaOfCircleWhenNegativeParameteres() throws Exception
    {
        Shape circle = new Square(-10.0d);
        assertEquals(0,circle.area(),2);
    }

    @Test
    public void testPerimeterOfCircleWhenPositiveParameteres() throws Exception
    {
        Shape circle = new Square(10.0d);
        assertEquals(62.800000000000004,circle.perimeter(),2);
    }

    @Test
    public void testPerimeterOfCircleWhenNegativeParameteres() throws Exception
    {
        Shape circle = new Square(-10.0d);
        assertEquals(0,circle.perimeter(),2);
    }
}