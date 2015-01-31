import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Zach on 1/22/15.
 */
public class User {

    private String login;
    private String password;
    private String name;
    private String role;
    //Character List
    private static char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'H', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ':', ';', '*', '@', '#', '$', '%', '^', '&', '*', '~', '`'};

    public User() {
        login = userNameGenerator();
        password = passwordGenerator();
        name = null;
    }

    public User(String login) {
        this.login = login;
        password = passwordGenerator();
        name = null;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        name = null;
    }

    public User(String login, String password, String role) {
        this.login = name;
        this.password = password;
        this.role = role;
        this.name = null;

    }

    public User(String login, String password, String role, String name) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.name = name;
    }

    //Getters and Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Random Character Generator
    private static int rng() {
        Random random = new Random();
        return random.nextInt(list.length);
    }

    //Username Generator
    private String userNameGenerator() {
        return passwordGenerator();
    }

    //Password Generator
    private String passwordGenerator() {
        String password = "";
        Random random = new Random();
        int randNumb = random.nextInt(9) + 8;
        ArrayList<Character> pass = new ArrayList<Character>();
        for (int i = 0; i <= randNumb; i++) {
            pass.add(list[rng()]);
        }
        for (int i = 0; i < pass.size(); i++) {
            password += pass.get(i);
        }
        return password;
    }
}