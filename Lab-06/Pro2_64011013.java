public class Pro2_64011013 {
    public static void main(String[] args) {
        Course course = new Course("HowToWakeup");
        course.addStudent("Amree");
        course.addStudent("Eram");
        course.addStudent("Haruta");
        course.dropStudent("Amree");
        for (int i = 0; i < course.getNumberOfStudents()-1; i++) {
            System.out.println("student " + (i+1) +" : " + course.getStudents()[i]);
        }
        
    }
}
