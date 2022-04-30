import java.util.GregorianCalendar;

public class Lab4_02_64011013 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gc.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + gc.get(GregorianCalendar.DAY_OF_WEEK));
        
        gc.setTimeInMillis(gc.getTimeInMillis()+86400000);
        
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + gc.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + gc.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gc.getTime());
    }
}
