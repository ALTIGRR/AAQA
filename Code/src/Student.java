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

    public float avgGrade() {
        float avg = (physicGrade + mathGrade + digitalTechGrade) / 3f;
        return avg;
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

    public int getCourse() {
        return course;
    }

    public void goToNextCourse() {
        course++;
    }
}
