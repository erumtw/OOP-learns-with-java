import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;


    public Employee(String name, String address, int phoneNums, String emailAddress, String office, double salary) {
        super(name, address, phoneNums, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    public void setDateHired() {
        this.dateHired = new Date();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nOffice: " + office 
        + "\nSalary: " + salary + "\nDate Hired: " + dateHired;
    }
}
