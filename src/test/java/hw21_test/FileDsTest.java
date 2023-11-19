import org.junit.jupiter.api.Test;
import edu.hw21_testing.DS.FileDs;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class FileDsTest {

    @Test
    void testAddData() {
        FileDs fileDs = new FileDs();
        fileDs.addData("Hello");

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new File("data.txt")));
            String line = reader.readLine();
            assertEquals("Hello", line);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected error");
        }
    }

    @Test
    void testGetData() {
        FileDs fileDs = new FileDs();
        fileDs.addData("Hello");
        fileDs.addData("World");

        String data = fileDs.getData(0);
        assertEquals("Hello", data);

        data = fileDs.getData(1);
        assertEquals("World", data);
    }

    @Test
    void testDelete() {
        FileDs fileDs = new FileDs();
        fileDs.addData("Hello");
        fileDs.addData("World");

        fileDs.delete(0);

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new File("data.txt")));
            String line = reader.readLine();
            assertEquals("World", line);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected error");
        }
    }
}