import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        int y, h, q, m, j, k;

        String[] day = new String[] { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year : ");
        y = input.nextInt();

        System.out.print("Enter month : ");
        m = input.nextInt();

        System.out.print("Enter the day of the month : ");
        q = input.nextInt();

        if (m == 1 || m == 2)
        {
            m += 12;
            y--;
        }

        j = y / 100;
        k = y % 100;

        h = (q + (26*(m+1))/10 + k + k/4 + j/4 + 5*j);
        h %= 7;

        System.out.println("The day of the weeks is " + day[h]);
    }
}
