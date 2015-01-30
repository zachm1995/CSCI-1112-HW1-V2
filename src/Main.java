import java.util.Scanner;

/**
 * Created by Zach on 1/22/15.
 */
public class Main {
    public static void main(String[] args) {
        //Creates admin account
        Admin root = new Admin("root", "pineapple", "admin");
        while(true) {
            root.printMenu();
        }
    }
}