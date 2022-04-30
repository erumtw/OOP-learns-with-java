/**
 * Person
 */
public class Person {
    private String name;
    private String address;
    private int phoneNums;
    private String emailAddress;

    public Person(String name, String address, int phoneNums, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNums = phoneNums;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNums() {
        return this.phoneNums;
    }

    public void setPhoneNums(int phoneNums) {
        this.phoneNums = phoneNums;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " 
        + phoneNums + "\nEmail: " + emailAddress;
    } 
}