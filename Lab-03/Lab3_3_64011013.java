import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class lab3_3_64011013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of Matrix : ");
        int size = in.nextInt();
        int[][] theMatrix = new int[size][size];

        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                theMatrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < theMatrix.length; i++) {
            for (int j = 0; j < theMatrix[i].length; j++) {
                System.out.print(theMatrix[i][j]);
            }
            System.out.println();
        }

        
        findAll0(theMatrix);
        System.out.println();
        findAll1(theMatrix);
        
    }

    public static void findAll0(int[][] s) {
        int count;
        System.out.print("All 0s on row ");
        for (int i = 0; i < s.length; i++) {
            count = 0;
            for (int j = 0; j < s[i].length; j++) {
                if(s[i][j] == 0)
                {
                    count++;
                }
            }
            if (count == s[i].length) {
                System.out.print((++i) + " ");
            }
        }
    }

    public static void findAll1(int[][] s) {
        int count;
        System.out.print("All 1s on row ");
        for (int i = 0; i < s.length; i++) {
            count = 0;
            for (int j = 0; j < s[i].length; j++) {
                if(s[i][j] == 1)
                {
                    count++;
                }
            }
            if (count == s[i].length) {
                System.out.print((++i) + " ");
            }
        }
    }
}
