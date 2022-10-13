import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentTest {
    @Test
    public void newStudentTest() {
        Student studente = new Student("Andrea", "Camoia");
        Assert.assertEquals("Andrea", studente.getFirstName());
        Assert.assertEquals("Camoia", studente.getLastName());
    }
    @Test
    public void addEsamTest() {
        Student studente = new Student("Andrea", "Camoia");
        Exam nuovoEsame = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        studente.registerExam(nuovoEsame);

        Assert.assertEquals(1, studente.getExams().size(), 0);
    }
    @Test
    public void averageGradeTest() {
        Student studente = new Student("Andrea", "Camoia");
        Exam esameUno = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        studente.registerExam(esameUno);
        Exam esameDue= new Exam("Sistemi Operativi", new GregorianCalendar(2023, Calendar.FEBRUARY, 3), 29);
        studente.registerExam(esameDue);

        Assert.assertEquals(29.5, studente.computeAverageGrade(), 0);
    }
}