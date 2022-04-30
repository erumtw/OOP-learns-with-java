import java.util.Scanner;

public class Pro4_64011013 {
    public static void main(String[] args) {
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[2]-Married separately");
        System.out.println("\t[3]-Head of household");

        Scanner in = new Scanner(System.in);
        Tax tax = new Tax();
        System.out.print("Enter the filing status: ");
        tax.setfilingStatus(in.nextInt());

        System.out.print("Enter the taxable income: ");
        tax.setTaxableIncome(in.nextDouble());

        System.out.println("Tax is " + tax.getTax());
        in.close();
    }
}
