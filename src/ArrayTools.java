import java.util.ArrayList;

/**
 * Created by Zach on 1/23/15.
 */
public class ArrayTools {
    //Prints one dimensional array by iteration
    public static void prntoned(ArrayList array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(array.get(i) + "");
        }
    }
    //Prints one dimensional array by iteration, adding the index next to each element
    public static void prntCourses(ArrayList<Course> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(i + ". " + (array.get(i)).getTitle() + " " + array.get(i).getCrn() + " Number of Students: " + array.get(i).numStudents());
        }
    }
    public static void prntStudents(ArrayList<Student> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(i + ". " + (array.get(i)).getName() + " " + array.get(i).getRole() + " ");
        }
    }
    public static void prntInstructors(ArrayList<Instructor> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(i + ". " + (array.get(i)).getName() + " " + array.get(i).getRole() + " ");
        }
    }
}
