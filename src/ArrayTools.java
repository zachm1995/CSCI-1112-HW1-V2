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
    public static void prntNumbered(ArrayList array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(i + ". " + array.get(i) + " ");
        }
    }
}
