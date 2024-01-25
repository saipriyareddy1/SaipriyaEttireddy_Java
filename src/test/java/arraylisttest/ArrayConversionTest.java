package arraylisttest;

import arraylist.ArrayConversion;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConversionTest extends TestCase {
    ArrayConversion arraycon = new ArrayConversion();

    //true case
    public void testConversion() {

        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Chicago", "Texas", "Cali"));
        //for loop true case
        String[] resultArray = new ArrayConversion().traverseWithForLoop(employeeList);

        // Check if the array has the same elements as the ArrayList
        Assert.assertEquals(new String[]{"Chicago", "Texas", "Cali"}, resultArray);
    }
    //fail case
    public void testConversion1() {

        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Chicago", "Texas", "Cali"));
        //for loop true case
        String[] resultArray = new ArrayConversion().traverseWithForLoop(employeeList);

        // Check if the array has the same elements as the ArrayList
        Assert.assertEquals(new String[]{"Chicago", "Texas", "Cali",null,null}, resultArray);
    }

}
