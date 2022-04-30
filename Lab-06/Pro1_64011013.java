import java.util.Scanner;

/**
 * Pro1_64011013
 */
public class Pro1_64011013 {
    public static String BMI(String name, int age, double weight, double feet, double inches) {
        double bmi = 0;
        double height = inches + (feet*12); //feet to inch

        bmi = ( weight / (height*height) )* 703;

        //System.out.printf("%s's BMI is %d", name, bmi);

        if (bmi < 18.5) {
            System.out.println("your bmi: "+ bmi);
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("your bmi: "+ bmi);
            return "Normal";
        }
        else if (bmi >= 25.0 && bmi < 30.0 ) {
            System.out.println("your bmi: "+ bmi);
            return "Overweight";
        }
        else{
            System.out.println("your bmi: "+ bmi);
            return "Obese";
        }
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = in.nextLine();
        
        System.out.print("Enter age: ");
        int age = in.nextInt();
        
        System.out.print("Enter weight(pounds): ");
        double weight = in.nextDouble();

        System.out.print("Enter height(feet): ");
        double feet = in.nextDouble();

        System.out.print("Enter height(inches): ");
        double inches = in.nextDouble();
        
        System.out.println("You are " + BMI(name, age, weight, feet, inches));
        
    }
}