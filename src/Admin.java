import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/22/15.
 */
public class Admin extends User {
    //Global variables
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    //Class constructor
    public Admin(String name, String password) {
        super(name, password);
    }
    //Prints text string to represent menu choices
    public void printMenu() {
        //Initializes scanner function
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Please choose one of the following Options:");
        System.out.println("1. Admin");
        System.out.println("2. Instructor");
        System.out.println("3. Student");
        //Decides account type submenu based on user input
        switch (scanner.nextInt()) {
            case 1:
                //Prints admin menu
                printAdminMenu();
                break;
            case 2:
                //prints instructor menu
                Instructor.printInstructorMenu();
                break;
            case 3:
                //prints student menu
                Student.printStudentMenu();
                break;
        }
    }
    //Prints admin menu
    public void printAdminMenu() {
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Administrator Menu:");
        System.out.println("1. Courses");
        System.out.println("2. Students");
        System.out.println("3. Instructors");
        //Decides admin submenu based on user input
        switch(scanner.nextInt())
        {
            case 1:
                //Prints course object options
                adminCoursesMenu();
                break;
            case 2:
                //Prints student object options
                adminStudentsMenu();
                break;
            case 3:
                //Prints instructor object options
                adminInstructorsMenu();
                break;
        }
    }
    //Prints admin course object options
    public void adminCoursesMenu(){
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Please select an option:");
        System.out.println("1. Add Course");
        System.out.println("2. Edit Course");
        System.out.println("3. Remove Course");
        //Decides which course object function to perform based on user input
        switch(scanner.nextInt())
        {
            case 1:
                //Adds a course object
                root.addCourse();
                break;
            case 2:
                //Edit a course object
                root.editCourse();
                break;
            case 3:
                //Remove a course object
                root.remCourse();
                break;
        }
    }
    //Prints admin student object options
    public void adminStudentsMenu(){
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Please select an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Remove Student");
        //Decides which student object function to perform based on user input
        switch(scanner.nextInt())
        {
            case 1:
                //Adds a student object
                addStudent();
                break;
            case 2:
                //Edit a student object
                editStudent();
                break;
            case 3:
                //Removes a student object
                remStudent();
                break;
        }
    }
    //Prints admin instructor object options
    public void adminInstructorsMenu(){
        //Initializes scanner
        Scanner scanner = new Scanner(System.in);
        //Prints menu options
        System.out.println("Please select an option:");
        System.out.println("1. Add Instructor");
        System.out.println("2. Edit Instructor");
        System.out.println("3. Remove Instructor");
        //Decides which instructor object function to perform based on user input
        switch(scanner.nextInt())
        {
            case 1:
                //Add an instructor object
                addInstructor();
                break;
            case 2:
                //Edit an instructor object
                editInstructor();
                break;
            case 3:
                //Remove an instructor object
                remInstructor();
                break;
        }
    }
    //Object functions
    public void addCourse(){
        //Create new course object

        //Add course to courses arraylist
    }
    public void editCourse(){
        //Changes information in course object
    }
    public void remCourse(){
        //Removes course from courses arraylist

        //Removes course from students and instructors participating in the course
    }
    public void addStudent(){
        //Creates a new student object

        //Add student object to students arraylist
    }
    public void editStudent(){
        //Changes information in student object
    }
    public void remStudent(){
        //Removes student object from students arraylist

        //Removes student from courses student is enrolled in
    }
    public void addInstructor(){
        //Creates a new instructor object

        //Add instructor object to instructors arraylist
    }
    public void editInstructor(){
        //Changes information in instructor object
    }
    public void remInstructor(){
        //Removes instructor object from instructors arraylist

        //Removes instructor object from any courses assigned to instructor
    }
}