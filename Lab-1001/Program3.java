import java.io.*;

public class Program3 {
    public static void main(String[] args) throws Exception {
        File file = new File("Pro4test.txt");

        if (file.exists()) {
            System.out.println("This file is already exists");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(file)) {

            for (int i = 0; i < 1000; i++) {
                output.print("FirstName"+ (i+1) + " LastName" + (i+1));
                String rank = getRank();
                double salary = getSalary(rank);
                output.printf(" %s %.2f\n", rank, salary);
            }

        System.out.println("successed");
    }

}
    public static String getRank() {
        String[] rank = {"assistant", "associate", "full"};
        return rank[(int)(Math.random()*3)];
    }

    public static double getSalary(String rank) {
        if(rank.equals("assistant")) 
            return 50000 + (double)(Math.random() * 30001);
        else if(rank.equals("associate"))
            return 60000 + (double)(Math.random() * 50001);
        else 
            return 75000 + (double)(Math.random() * 55001);
    }
}
