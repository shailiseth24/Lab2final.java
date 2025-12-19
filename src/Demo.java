import java.util.Scanner;

class box
{
    double length, width, height;
    double volume()
    {
        return length * width * height;
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        box b = new box();
        System.out.print("Enter length: ");
        b.length = sc.nextDouble();
        System.out.print("Enter width: ");
        b.width = sc.nextDouble();
        System.out.print("Enter height: ");
        b.height = sc.nextDouble();
        System.out.println("Volume of the box = " + b.volume());
        sc.close();
    }
}