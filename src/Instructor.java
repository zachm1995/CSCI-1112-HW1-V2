import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/23/15.
 */
public class Instructor extends User {
    //Global variables
    private ArrayList<Course>courses = new ArrayList<Course>();
    //Class Constructor
    public Instructor(String name, String password, String role) {
        super(name, password, role);
    }
    //Returns courses arraylist
    private ArrayList<Course> getCourses() {
        return courses;
    }
    //Prints instructor menu
    public void printInstructorMenu(){
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Instructor Menu:");
        //Lists courses instructor is currently assigned to with number of students enrolled in each class
        listCourses();
    }
    public void listCourses() {
        ArrayTools.prntCourses(Admin.courses);
    }
}