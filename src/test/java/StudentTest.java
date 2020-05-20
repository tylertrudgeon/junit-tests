import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student withGrade;

    @Before
    public void setup(){
        withGrade = new Student("Bill", 456789L);
        withGrade.addGrade(85);
        withGrade.addGrade(87);
    }

    @Test
    public void checkGetName(){
        Student Tyler = new Student("Tyler", 123456L);
        assertFalse(Tyler.getName().equals("Bill"));
    }

    @Test
    public void checkGetId(){
        Student Tyler = new Student("Tyler", 123456L);
        assertNotEquals(234567L, Tyler.getId());
    }

    @Test
    public void checkAddGrade(){
        Student Tyler = new Student("Tyler", 123456L);
        Tyler.addGrade(92);
        Tyler.addGrade(97);
        assertTrue(Tyler.contains(92));
        assertTrue(Tyler.contains(97));
    }

    @Test
    public void checkGradeAverage(){
        Student Tyler = new Student("Tyler", 123456L);
        Tyler.addGrade(95);
        Tyler.addGrade(97);
        assertEquals(96, Tyler.getGradeAverage());
    }


}
