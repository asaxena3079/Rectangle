public class FactoryShape {

    public Rectangle createRectangle(double length, double breadth)
    {
        return new Rectangle(length,breadth);
    }

    public Square createSquare(double length)
    {
        return new Square(length);
    }

    public Circle createCircle(double radius)
    {
        return new Circle(radius);
    }

}
