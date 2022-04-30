public class Faculty extends Employee {
    private String officeHour; 
    private double rank;


    public Faculty(String name, String address, int phoneNums, String emailAddress, String office, double salary, String officeHour, double rank) {
        super(name, address, phoneNums, emailAddress, name, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public String getOfficeHour() {
        return this.officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public double getRank() {
        return this.rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nOffice: " + officeHour
        + "\nRank: " + rank;
    }
}
