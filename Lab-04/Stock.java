/**
 * Stock
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;    

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.symbol = name;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
    }
}