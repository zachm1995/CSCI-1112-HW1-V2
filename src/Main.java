import java.util.Scanner;

/**
 * Created by Zach on 1/22/15.
 */
public class Main {
    //Creates admin account
    Admin root = new Admin("root", "pineapple");
    public static void main(String[] args) {
        //Prints main menu
        root.printMenu();
    }
}
