package arraylisttest;

import arraylist.RemoveObject;
import arraylist.TraverseArray;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveObjectTest extends TestCase {
    RemoveObject removeobj = new RemoveObject();
    public void testRemove() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Shiva", "Sai"));
        employeeList = removeobj.removeObject(employeeList);
        Assert.assertEquals(Arrays.asList("Shiva"), employeeList);
        employeeList = removeobj.removeObject(employeeList);
        Assert.assertTrue(employeeList.isEmpty());
    }
    public void testRemoveFailure() {
        ArrayList<String> employeeList = new ArrayList<>();
        removeobj.removeObject(employeeList);
        Assert.assertTrue(employeeList.isEmpty());
    }
}
