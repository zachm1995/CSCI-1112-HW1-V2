import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/23/15.
 */
public class Student extends User {
    //Global variables
    private static ArrayList<Course> courses = new ArrayList<Course>();
    //Class constructor

    public Student() {
    }

    public Student(String login) {
        super(login);
    }

    public Student(String login, String password) {
        super(login, password);
    }

    public Student(String login, String password, String name) {
        super(login, password, name);
    }

    public Student(String login, String password, String role, String name) {
        super(login, password, role, name);
    }

    //Prints list of courses student is enrolled in
    private void listCourses(){
        ArrayTools.prntCourses(courses);
    }
    //Returns courses student is currently enrolled in
    public ArrayList<Course> getCourses() {
        return courses;
    }
    //Prints student menu
    public void printStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Menu:");
        System.out.println("1. Add Course");
        System.out.println("2. Drop Course");
        System.out.println("3. List Courses");
        System.out.println("4. Logout");
        //Choice selection
        switch (scanner.nextInt()) {
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
                listCourses();
                break;
            case 4:
                //Logout
                Main.printMenu();
        }
    }

        //Prints student drop menu

    public void studentDropMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which course would you like to drop?");
        ArrayTools.prntCourses(Admin.courses);
        int select = scanner.nextInt();
        Admin.courses.get(select).students.remove(this);
    }

    //Prints course registration process
    public void studentRegistrationMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which course would you like to register for?");
        ArrayTools.prntCourses(Admin.courses);
        int select = scanner.nextInt();
        Admin.courses.get(select).students.add(this);
    }
}