import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Lab_04_64011013
 */
public class Lab4_03_64011013 {
    public static void main(String[] args) {
        firstphase();       
        System.out.println("------------------------------------------------------------"); 
        secondphase();
    }

    public static void printing(double[] list1) {
        for (int i = 0; i < list1.length; i++) {
            System.out.printf("%.2f\t", list1[i]);
            
            if((i+1)%10 == 0)
            {
                System.out.println();
            }
        }
    }

    public static void firstphase() {
        double[] list = new double[1000]; 

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * 1000;
        }
        printing(list);
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts......");

        StopWatch sw = new StopWatch();
        Arrays.sort(list);
        sw.stop();
        
        printing(list);

        System.out.println("The sort time is " + sw.getElapsedTime() + " Milliseconds");
    }

    public static void secondphase() {
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");

        StopWatch sw2 = new StopWatch();
        PalinPrim.printing();
        sw2.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is " + sw2.getElapsedTime() + " Milliseconds");
    }

}