public class Pro3 {
    public static void main(String[] args) {
        Person person = new Person("Liw", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 911, "Liw@gmail.com");
        Student student = new Student("Suk", "10 Chalongkrung Road, Ladkrabang, BKK, 10520", 912, "Suk@gmail.com", 1);
        Employee employee = new Employee("kun", "101 Chalongkrung Road, Ladkrabang, BKK, 10520", 9142, "Kun@gmail.com", "Adobe", 97452);
        Faculty faculty = new Faculty("kun", "9 Chalongkrung Road, Ladkrabang, BKK, 10520", 91422, "Kun@gmail.com", "Facebook", 97452, "8", 1);
        Staff staff = new Staff("Pop", "11 Chalongkrung Road, Ladkrabang, BKK, 10520", 913, "Suk@gmail.com", "Google", 9000, "GEO");

        System.out.println("Person\n" + person.toString() + "\n");
        System.out.println("Student\n" + student.toString() + "\n");
        System.out.println("Employee\n" + employee.toString() + "\n");
        System.out.println("Faculty\n" + faculty.toString() + "\n");
        System.out.println("Staff\n" + staff.toString() + "\n");
    }
}
