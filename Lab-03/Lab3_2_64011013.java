import java.util.Arrays;
import java.util.Scanner;
public class lab3_2_64011013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of list1 : ");
        int l1 = in.nextInt();
    
        int[] list1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            list1[i] = in.nextInt();
        }

        System.out.print("Enter amount of list2 : ");
        int l2 = in.nextInt();
        int[] list2 = new int[l2];
        for (int j = 0; j < l2; j++) {
            list2[j] = in.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);
        
        // int length1 = list1.length; 
        // int length2 = list ;
        
        System.out.println(Arrays.toString(merge(list1, list2)));
    }
    
    public static int[] merge(int[] list1, int[] list2)
    {
        int[] merging = new int[(int)list1.length + (int)list2.length];
        System.arraycopy(list1, 0, merging, 0, list1.length);
        System.arraycopy(list2, 0, merging, list1.length, list2.length);
        Arrays.sort(merging);
        return merging;
    }
        
    
}
