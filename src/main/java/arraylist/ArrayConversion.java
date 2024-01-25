package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversion {
    public static String[] traverseWithForLoop(ArrayList<String> employeeList)  {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);
        return array;
    }
}
