import java.util.Scanner;

public class MainClass {

    public static void main(String[] args)
    {
        Shape shape = null;
        FactoryShape factoryShape = new FactoryShape();

        System.out.println("Select the shape you want to create : ");
        System.out.println("1 for Rectangle");
        System.out.println("2 for Square");
        System.out.println("3 for RectanCirclegle");
        System.out.println("4 for Exit");
        System.out.println("Enter your choice");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You opted for Rectangle");
                System.out.println("Enter Length : ");
                double length = sc.nextDouble();
                System.out.println("Enter breadth : ");
                double breadth = sc.nextDouble();
                shape = factoryShape.createRectangle(length,breadth);
                break;

            case 2:
                System.out.println("You opted for Square");
                System.out.println("Enter the length of side : ");
                double side = sc.nextDouble();
                shape = factoryShape.createSquare(side);
                break;

            case 3:
                System.out.println("You opted for Circle");
                System.out.println("Enter the radius : ");
                double radius = sc.nextDouble();
                shape = factoryShape.createCircle(radius);
                break;

            default:
                System.exit(0);
        }


        System.out.println("What to find");
        System.out.println("1 for Area :");
        System.out.println("2 for Perimeter :");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Area is : " + shape.area());
                break;

            case 2:
                System.out.println("Perimeter is : " + shape.perimeter());
                break;

            default:
                System.exit(0);
        }




    }

}
