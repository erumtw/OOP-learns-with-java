import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lab2_4 {
    public static void main(String[] args) {
        String[] city = new String[3];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        city[0] = in.nextLine();
        System.out.print("Enter the second city: ");
        city[1] = in.nextLine();
        System.out.print("Enter the third city: ");
        city[2] = in.nextLine();

        Arrays.sort(city, 0, city.length, String.CASE_INSENSITIVE_ORDER);

        System.out.println("The three cities in alphabetical order are " + city[0] + " " + city[1] + " " + city[2]);
    }
}
