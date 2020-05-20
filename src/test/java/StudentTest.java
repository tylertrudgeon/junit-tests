import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student withGrade;

    @Before
    public void setup(){
        Student.grades = new ArrayList<>();
        withGrade = new Student("Bill", 456789L);
        withGrade.addGrade(85);
    }

    @Test
    public void checkContains(){
        assertTrue(withGrade.contains(85));
    }

    @Test
    public void checkStudentName(){
        assertEquals("Bill", Student.studentName);
        assertNotEquals("Tyler", Student.studentName);
    }



}
