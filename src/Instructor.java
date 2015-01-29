import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/23/15.
 */
public class Instructor extends User {
    //Global variables
    private ArrayList<Course>courses = new ArrayList<Course>();
    //Class Constructor
    public Instructor(String name, String password) {
        super(name, password);
    }
    //Returns courses arraylist
    public ArrayList<Course> getCourses() {
        return courses;
    }
    //Prints instructor menu
    public static void printInstructorMenu(){
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Instructor Menu:");
        //Lists courses instructor is currently assigned to with number of students enrolled in each class
        listCourses();
    }

}
