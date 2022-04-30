import java.util.Scanner;

/**
 * Pro3_64011013
 */
public class Pro3_64011013 {
    public static void main(String[] args) {
        int var, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        var = in.nextInt(); 
        for (int i = 0; var != 0; i++) {
            sum += var % 10;
            var = var / 10;  
        }
        System.out.println("The sum of the digits is " + sum);
    }
    
}