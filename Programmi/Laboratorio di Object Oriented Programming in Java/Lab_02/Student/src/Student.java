import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    List<Exam> exams;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exams = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void registerExam(Exam exam) {
        this.exams.add(exam);
    }

    public double computeAverageGrade() {
        double sommaVoti = 0;
        for (Exam exam : this.exams) {
           sommaVoti = sommaVoti + exam.getGrade();
        }
        double mediaVoti = sommaVoti / exams.size();
        return mediaVoti;
    }
}