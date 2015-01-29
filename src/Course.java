import java.util.ArrayList;

/**
 * Created by Zach on 1/23/15.
 */
public class Course {
    //Global variables
    private String title;
    private String crn;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    //Class Constructor
    public Course(String title, String crn) {
        this.title = title;
        this.crn = crn;
    }
    //Returns course title
    public String getTitle() {
        return title;
    }
    //Sets course title
    public void setTitle(String title) {
        this.title = title;
    }
    //Returns course number
    public String getCrn() {
        return crn;
    }
    //Sets course number
    public void setCrn(String crn) {
        this.crn = crn;
    }
    //Returns number of students enrolled in the course
    public int numStudents(){
        return students.size();
    }

}
