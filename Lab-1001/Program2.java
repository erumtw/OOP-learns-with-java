import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTriangle = false;
        do {
            try {
                System.out.print("\nEnter 3 sides: ");
                Triangle triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
                System.out.println(triangle.toString()); 
                isTriangle = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e);
                System.out.println("Please try again");
            }    
        } while (isTriangle == false);
    }
}
