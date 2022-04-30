import java.util.Scanner;

public class lab2_5 {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) //row
        { 
            for (int blank = 0; blank < num-i; blank++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j );
            }
            System.out.println();
        }
    }
}
