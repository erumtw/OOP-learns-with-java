import java.util.Scanner;
/**
 * lab2_1
 */
public class lab2_1 {
    public static void main(String[] args) {

        int today, elapsed;
        String[] day = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        today = in.nextInt();

        System.out.print("Enter the number of days elapsed since today : ");
        elapsed = in.nextInt();

        System.out.print("Today is " + day[today]);

        for (int i = 0; i < elapsed; i++) {
            today++;
            if (today > 6) 
                today = 0;
        }

        System.out.println(" and the future day is " + day[today]);

    }
}