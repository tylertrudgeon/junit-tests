import java.util.ArrayList;
import java.util.List;

public class Student {

    public static void main(String[] args) {
        Student Tyler = new Student("Tyler", 123456L);
        System.out.println(Tyler.getId());
        Tyler.addGrade(89);
        Tyler.addGrade(95);
        System.out.println(Tyler.getGradeAverage());
        System.out.println(Tyler.getName());
    }

    public static String studentName = "";
    public static Long studentID = 0L;
    public static ArrayList<Integer> grades;


    public Student(String studentName, Long studentID) {
        Student.studentName = studentName;
        Student.studentID = studentID;
        Student.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId() {
        return Student.studentID;
    }

    // returns the student's name
    public String getName() {
        return Student.studentName;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        Student.grades.add(grade);
    }

    //returns the average of the students grades
    public int getGradeAverage() {
        int gradeAvg = 0;
        for (int gradeD : grades) {
            gradeAvg += gradeD;
        } return gradeAvg / Student.grades.size();
    }

    public boolean contains (Integer grade) {
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i).equals(grade)){
                return true;
            }
        }
        return false;
    }

}
