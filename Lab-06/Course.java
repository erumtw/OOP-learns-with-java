public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents+1;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(student)) {
                students[i] = null;
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i+1];
                    i++;
                }
                break;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}
