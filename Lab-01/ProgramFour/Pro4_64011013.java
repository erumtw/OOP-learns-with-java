import java.util.Scanner;

/**
 * Pro4_64011013
 */
public class Pro4_64011013 {
    public static float BmiCaluclate(float weight, float height) {
        float bmi = (weight / height / height) * 703; // Formula: weight (lb) / [height (in)]2 x 703
        return bmi;
    }
    public static void main(String[] args) {
        float w, h;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight(lb) : ");
        w = in.nextFloat();
        System.out.print("Enter height(in) : ");
        h = in.nextFloat();
        System.out.println("Your BMI is " + BmiCaluclate(w, h));
    }
}