public class Rectangle implements Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double height)
    {
        this.length = length;
        this.breadth = height;
    }

    @Override
    public double area()
    {
        if(this.length>0 && this.breadth >0)
            return length* breadth;
        else
            return 0;
    }

    @Override
    public double perimeter()
    {
        if(this.length>0 && this.breadth >0)
            return 2*(length+ breadth);
        else
            return 0;
    }
}
