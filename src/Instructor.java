import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/23/15.
 */
public class Instructor extends User {
    //Global variables
    private ArrayList<Course>courses = new ArrayList<Course>();
    //Class Constructor

    public Instructor() {
    }

    public Instructor(String login) {
        super(login);
    }

    public Instructor(String login, String password) {
        super(login, password);
    }

    public Instructor(String login, String password, String name) {
        super(login, password, name);
    }

    public Instructor(String login, String password, String role, String name) {
        super(login, password, "instructor", name);
    }

    //Returns courses arraylist
    private ArrayList<Course> getCourses() {
        return courses;
    }
    //Prints instructor menu
    public void printInstructorMenu(){
        //Prints menu options
        Scanner scanner = new Scanner(System.in);
        System.out.println("Instructor Menu:");
        System.out.println("To logout type \"logout\"");
        String logout = scanner.next().toLowerCase();
        if(logout.equals("logout")){
            Main.printMenu();
        }
        //Lists courses instructor is currently assigned to with number of students enrolled in each class
        listCourses();
    }
    public void listCourses() {
        ArrayTools.prntCourses(Admin.courses);
    }
}