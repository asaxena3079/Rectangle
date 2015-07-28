public class Square implements Shape {

    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public double area()
    {
        if(this.side>0)
            return side* side;
        else
            return 0;
    }

    @Override
    public double perimeter()
    {
        if(this.side >0)
            return 4*(side);
        else
            return 0;
    }
}
