import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int physicGrade;
    private int mathGrade;
    private int digitalTechGrade;

    public Student(String name, String group, int course, int physicGrade, int mathGrade, int digitalTechGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.physicGrade = physicGrade;
        this.mathGrade = mathGrade;
        this.digitalTechGrade = digitalTechGrade;
    }

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
            if (student.course == course) {
                System.out.println("- " + student.getName());
            }
        }
    }

    public float avgGrade() {
        float avg = (physicGrade + mathGrade + digitalTechGrade) / 3f;
        return avg;
    }

    public String nextCourse() {
        if (avgGrade() >= 3) {
            course++;
        }
        return "\nПереход на следующий курс: " + toString() + "\nСтудент поступил на: " + course + " курс.";
    }

    @Override
    public String toString() {
        return "\nСтудент: " + name + ", Группа: " + group + ", Курс: " + course + ", Баллы: Физика: " + physicGrade + ", Математика: " + mathGrade + ", Цифровые технологии: " + digitalTechGrade;
    }

    public String getAvg() {
        return toString() + "\nСредний балл студента: " + avgGrade();
    }

    public String getName() {
        return name;
    }
}
