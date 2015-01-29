import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/23/15.
 */
public class Student extends User {
    //Global variables
    private static ArrayList<Course> courses = new ArrayList<Course>();
    //Class constructor
    public Student(String name, String password) {
        super(name, password);
    }
    //Prints list of courses student is enrolled in
    public static void listCourses(){
        ArrayTools.prntNumbered(courses);
    }
    //Returns courses student is currently enrolled in
    public static ArrayList<Course> getCourses() {
        return courses;
    }
    //Prints student menu
    public static void printStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Menu:");
        System.out.println("1. Add Course");
        System.out.println("2. Drop Course");
        System.out.println("3. List Courses");
        //Choice selection
        switch(scanner.nextInt())
        {
            case 1:
                //Brings up dialog to add a course object to student object
                studentRegistrationMenu();
                break;
            case 2:
                //Brings up dialog to drop a course from student object
                studentDropMenu();
                break;
            case 3:
                //Lists courses student is currently enrolled in
                Student.listCourses();
                break;
        }
    }
    //Prints student drop menu
    public static void studentDropMenu() {
        System.out.println("Which course would you like to drop?");
        ArrayTools.prntNumbered(Student.getCourses());
    }
    //Prints course registration process
    public static void studentRegistrationMenu(){
        System.out.println("Which course would you like to register for?");
        ArrayTools.prntNumbered(Admin.courses);
    }
}
