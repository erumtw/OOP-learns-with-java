import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();

        System.out.print("Enter color: ");
        String color = in.next();

        System.out.print("Filled ?: ");
        boolean filled = in.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println("\n" + triangle.toString());
    
    }
}
