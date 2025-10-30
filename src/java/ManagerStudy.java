import java.util.Iterator;
import java.util.List;

public class ManagerStudy {
    public static void missedStudent(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.avgGrade() < 3) {
                studentIterator.remove();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + "го курса: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
            }
        }
    }

    public static void nextCourse(List<Student> students) {
        for (Student student : students) {
            if (student.avgGrade() >= 3) {
                student.goToNextCourse();
            }
        }
    }
}

