public class PalinPrim {
    public static void printing() {
        int count = 0;
        int temp = 2 , row = 0;
        while ( count < 100) {
            if (IsPrime(temp) && IsPLD(temp)) {
                System.out.print(temp + " ");
                count++;
                row++;
                if (row == 10) {
                    System.out.println();
                    row = 0;
                }
            }
            temp++;
        }
    }

    public static boolean IsPLD(int nums) {
        int temp, r, sum = 0;
        temp = nums;
        while (nums > 0) {
            r = nums % 10;
            sum = (sum*10) + r;
            nums /= 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean IsPrime (int nums) {
        for (int i = 2; i < nums; i++) {
            if (nums % i == 0 && i != nums) {
                return false;
            }   
        }
        return true;
    }
}
