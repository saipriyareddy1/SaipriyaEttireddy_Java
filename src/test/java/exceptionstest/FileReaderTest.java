package exceptionstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import exceptions.FileReader;

import java.io.FileNotFoundException;

public class FileReaderTest extends TestCase {
    FileReader fileReader = new FileReader();
    public void testFileReader() {
        String output = fileReader.readFile("C:\\Users\\saipr\\OneDrive\\Desktop\\CIS\\SaipriyaEttireddy_Java\\src\\main\\resources\\Docs");
        Assert.assertEquals("Java Programming", output);
    }
    public void testFileException() {
        try {
            fileReader.readFile("Docs.txt");
            fail("Expected RuntimeException, but no exception was thrown");
        } catch (RuntimeException e) {
            assertEquals("File not found", e.getMessage());
        }
    }
}