import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    Student Tyler;

    @Before
    public void setup(){
        Student Tyler = new Student("Tyler", 123456L);
    }

    @Test
    public void checkGetName(){
        assertFalse(Tyler.getName().equals("Bill"));
        assertEquals("Tyler", Tyler.getName());
    }

    @Test
    public void checkGetId(){
        assertNotEquals(234567L, Tyler.getId());
    }

    @Test
    public void checkAddGrade(){
        Tyler.addGrade(92);
        Tyler.addGrade(97);
        assertTrue(Tyler.contains(92));
        assertTrue(Tyler.contains(97));
    }

    @Test
    public void checkGradeAverage(){
        Tyler.addGrade(95);
        Tyler.addGrade(97);
        assertEquals(96, Tyler.getGradeAverage());
    }


}
