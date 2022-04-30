public class Pro5_64011013 {
    public static void main(String[] args) {
        Tax tax = new Tax();
        for (int i = tax.SINGLE_FILER; i <= tax.HEAD_OF_HOUSEHOLD; i++) {
            System.out.println("Status : " + i);
            System.out.println("example");
            for (int j = 50000; j <= 60000; j+= 5000) {
                tax.setfilingStatus(i);
                tax.setTaxableIncome(j);
                System.out.println(j + " tax is " + tax.getTax());
            }   
            System.out.println();
        }
    }
}
