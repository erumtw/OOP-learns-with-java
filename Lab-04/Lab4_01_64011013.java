public class Lab4_01_64011013 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        
        System.out.println("Symbol : " + stock.symbol);
        System.out.println("Name : " + stock.name);
        System.out.println("Previous Closing Orice : " + stock.previousClosingPrice);
        System.out.println("Current Price : " + stock.currentPrice);
        System.out.println("Price Change : " + stock.getChangePercent() + " %");
        
    }
}
