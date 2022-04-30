import java.util.Random;
import java.util.Scanner;

/**
 * Program1
 */
public class Program1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean outs = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        do {
            try {
                System.out.print("Enter index: ");
                System.out.println(array[in.nextInt()]);
                outs = false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds");

            }
        } while (outs);
    }
}