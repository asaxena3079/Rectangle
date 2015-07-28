public class Circle implements Shape{

    private  double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double area()
    {
        if(this.radius>0)
            return 3.14 *radius* radius;
        else
            return 0;
    }

    @Override
    public double perimeter()
    {
        if(this.radius >0)
            return 2*3.14*radius;
        else
            return 0;
    }
}
