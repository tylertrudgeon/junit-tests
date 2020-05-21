import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithOne.addStudent(fer);
        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
        assertEquals(2, cohortWithMany.getStudents().size());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(95, cohortWithMany.getCohortAverage(), 0);
        assertEquals(90, cohortWithOne.getCohortAverage(),0);
    }

    @Test
    public void testIfGetStudentsWorks(){
        assertNotSame(cohortWithOne.getStudents(), cohortWithMany.getStudents());
        assertNotSame(emptyCohort, cohortWithOne);
        assertEquals(0, emptyCohort.getStudents().size());
    }

}