import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        Student harvy = new Student("Harvy", "192", 3, 2, 4, 2);
        Student alan = new Student("Alan", "195", 2, 3, 4, 3);
        Student rayan = new Student("Rayan", "193", 4, 5, 5, 5);
        Student christian = new Student("Christian", "189", 4, 5, 4, 4);
        ArrayList<Student> students = new ArrayList<>();
        students.add(harvy);
        students.add(alan);
        students.add(rayan);
        students.add(christian);
        for (Student student : students) {
            System.out.println(student.getAvg());
        }
        ManagerStudy.missedStudent(students);
        System.out.println("После отчислений:");
        for (Student student : students) {
            System.out.println(student);
        }
        ManagerStudy.nextCourse(students);
        System.out.println("Перешли на следующий курс: \n" + students);
        ManagerStudy.printStudents(students, 3);
        ManagerStudy.printStudents(students, 4);
        ManagerStudy.printStudents(students, 5);
    }
}
