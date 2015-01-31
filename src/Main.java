import java.util.Scanner;

/**
 * Created by Zach on 1/22/15.
 */
public class Main {
    public static void main(String[] args) {
        printMenu();
    }
    //Prints text string to represent menu choices
    public static void printMenu() {
        //Creates admin account
        Admin root = new Admin("P1n3apPl3");
        //Creates instructor account
        Instructor instructor = new Instructor("BOB", "1234");
        //Creates student account
        Student student = new Student("student", "1234");
        while(true) {
            //Initializes scanner function
            Scanner scanner = new Scanner(System.in);
            //Decides account type submenu based on user input
            System.out.println("Please enter username or type \"exit\"");
            String usrnme = scanner.next();
            if (usrnme.equals("exit")) {
                System.exit(0);
            }
            System.out.println("Please enter password");
            String psswrd = scanner.next();
            switch (Admin.login(usrnme, psswrd)) {
                case 19928340:
                    //Prints admin menu
                    while(true) {
                        root.printAdminMenu();
                    }
                case 1873766211:
                    //prints instructor menu
                    while(true) {
                        Admin.instructors.get(Admin.idxSearch(usrnme, psswrd)).printInstructorMenu();
                    }
                case 129384584:
                    //prints student menu
                    while(true) {
                        Admin.students.get(Admin.idxSearch(usrnme, psswrd)).printStudentMenu();
                    }
                case -1:
                    System.out.println("Invalid login");
                    break;
            }
        }
    }
}