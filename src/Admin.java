import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 1/22/15.
 */
public class Admin extends User {
    //Global variables
    private ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    private int numCourses = 0, numInstructors = 0, numStudents = 0;
    public static ArrayList<Course> courses = new ArrayList<Course>();
    //Class constructor
    public Admin(String name, String password, String role) {
        super(name, password, role);
    }
    //Prints text string to represent menu choices
    public void printMenu() {
        Instructor instructor = new Instructor("BOB","1234","instructor");
        Student student = new Student("student","1234","student");
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
                instructor.printInstructorMenu();
                break;
            case 3:
                //prints student menu
                student.printStudentMenu();
                break;
        }
    }
    //Prints admin menu
    private void printAdminMenu() {
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
    private void adminCoursesMenu(){
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
                addCourse();
                break;
            case 2:
                //Edit a course object
                editCourse();
                break;
            case 3:
                //Remove a course object
                remCourse();
                break;
        }
    }
    //Prints admin student object options
    private void adminStudentsMenu(){
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
    private void adminInstructorsMenu(){
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
    private void addCourse(){
        //Create new course object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Title");
        String temp1 = scanner.nextLine();
        System.out.println("Enter Course Number");
        String temp2 = scanner.nextLine();
        Course course = new Course(temp1, temp2);
        //Add course to courses arraylist
        courses.add(course);
        this.numCourses++;
        System.out.println("Course created!");
    }
    private void editCourse(){
        //Changes information in course object
        Scanner scanner = new Scanner(System.in);
        ArrayTools.prntCourses(courses);
        System.out.println("Enter Number of Course to Edit");
        int select = scanner.nextInt();
        System.out.println("Please choose one of the following Options:");
        System.out.println("1. Change Title");
        System.out.println("2. Change Course Number");
        System.out.println("3. Add Instructor to Course");
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Enter new title for course:");
                courses.get(select).setTitle(scanner.nextLine());
                break;
            case 2:
                System.out.println("Enter new course number for course:");
                courses.get(select).setCrn(scanner.nextLine());
                break;
            case 3:
                ArrayTools.prntInstructors(instructors);
                System.out.println("Select an Instructor");
                int selection = scanner.nextInt();
                System.out.println("Select a course to assign to instructor");
                int selection2 = scanner.nextInt();
                (courses.get(selection2)).instructors.add(instructors.get(selection));
        }
    }
    private void remCourse(){
        //Removes course from courses arraylist
        Scanner scanner = new Scanner(System.in);
        listCourses();
        System.out.println("Enter Number of Course to Remove");
        courses.remove(scanner.nextInt());
        //Removes course from students and instructors participating in the course

    }
    private void addStudent(){
        //Creates a new student object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String temp1 = scanner.nextLine();
        System.out.println("Enter Password");
        String temp2 = scanner.nextLine();
        Student student = new Student(temp1, temp2, "student");
        //Add student object to students arraylist
        students.add(student);
        this.numStudents++;
        System.out.println("Student account created!");
    }
    private void editStudent(){
        //Changes information in student object
        Scanner scanner = new Scanner(System.in);
        ArrayTools.prntStudents(students);
        System.out.println("Enter Number of Student to Edit");
        int select = scanner.nextInt();
        System.out.println("Please choose one of the following Options:");
        System.out.println("1. Change Name");
        System.out.println("2. Change Password");
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Enter new name for student:");
                students.get(select).setName(scanner.nextLine());
                break;
            case 2:
                System.out.println("Enter new password for student:");
                students.get(select).setPassword(scanner.nextLine());
                break;
        }
    }
    private void remStudent(){
        //Removes student object from students arraylist
        Scanner scanner = new Scanner(System.in);
        listStudents();
        System.out.println("Enter Number of Student to Remove");
        students.remove(scanner.nextInt());
        //Removes student from courses student is enrolled in
    }
    private void addInstructor(){
        //Creates a new instructor object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Instructor Name");
        String temp1 = scanner.nextLine();
        System.out.println("Enter Password");
        String temp2 = scanner.nextLine();
        Instructor instructor = new Instructor(temp1, temp2, "instructor");
        //Add instructor object to instructors arraylist
        instructors.add(instructor);
        this.numInstructors++;
        System.out.println("Instructor account created!");
    }
    private void editInstructor(){
        //Changes information in instructor object
        Scanner scanner = new Scanner(System.in);
        ArrayTools.prntInstructors(instructors);
        System.out.println("Enter Number of Instructor to Edit");
        int select = scanner.nextInt();
        System.out.println("Please choose one of the following Options:");
        System.out.println("1. Change Name");
        System.out.println("2. Change Password");
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Enter new name for instructor:");
                instructors.get(select).setName(scanner.nextLine());
                break;
            case 2:
                System.out.println("Enter new password for instructor:");
                instructors.get(select).setPassword(scanner.nextLine());
                break;
        }
    }
    private void remInstructor(){
        //Removes instructor object from instructors arraylist
        Scanner scanner = new Scanner(System.in);
        listInstructors();
        System.out.println("Enter Number of Instructor to Remove");
        instructors.remove(scanner.nextInt());
        //Removes instructor object from any courses assigned to instructor
    }
    public void listCourses() {
        ArrayTools.prntCourses(courses);
    }
    public void listInstructors() {
        ArrayTools.prntInstructors(instructors);
    }
    public void listStudents() {
        ArrayTools.prntStudents(students);
    }
}