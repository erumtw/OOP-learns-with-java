public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, int phoneNums, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNums, emailAddress, name, salary);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nTitle: " + title;
    }
}
