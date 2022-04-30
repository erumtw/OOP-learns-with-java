public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 2;

    public Student(String name, String address, int phoneNums, String emailAddress, int status) {
        super(name, address, phoneNums, emailAddress);
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nstatus" + status;
    }
}
