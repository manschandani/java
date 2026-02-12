class Student {
    String name;
    double[] grades = new double[20];
    int gradeCount = 0;

    Student(String name) {
        this.name = name;
    }

    void addGrade(double grade) {
        grades[gradeCount] = grade;
        gradeCount++;
        System.out.println("Grade added: " + grade + " for " + name);
    }

    double calculateAverage() {
        if (gradeCount == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }

        return sum / gradeCount;
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < gradeCount; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + calculateAverage());
        System.out.println("---------------------");
    }
}

class GradeManager {
    Student[] students = new Student[20];
    int studentCount = 0;

    void addStudent(Student student) {
        students[studentCount] = student;
        studentCount++;
        System.out.println("Student added: " + student.name);
    }

    Student findStudentByName(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].name.equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }
}

public class case5 {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(88);

        s2.addGrade(75);
        s2.addGrade(80);
        s2.addGrade(70);

        manager.displayAllStudents();
    }
}

