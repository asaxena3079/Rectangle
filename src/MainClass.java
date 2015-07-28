public class MainClass {

    public static void main(String[] args)
    {
        Shape rect = new Rectangle(10.0,20.0);
        System.out.println("Rectangle");
        System.out.println("Area is : " + rect.area());
        System.out.println("Perimeter is : " + rect.perimeter());

        Shape square = new Square(10.0);
        System.out.println("\nSquare");
        System.out.println("Area is : " + square.area());
        System.out.println("Perimeter is : " + square.perimeter());

        Shape circle = new Circle(10.0);
        System.out.println("\nCircle");
        System.out.println("Area is : " + circle.area());
        System.out.println("Perimeter is : " + circle.perimeter());
    }

}
