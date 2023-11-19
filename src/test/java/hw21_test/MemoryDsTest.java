package hw21_test;

import org.junit.jupiter.api.Test;
import edu.hw21_testing.DS.MemoryDs;


import static org.junit.jupiter.api.Assertions.*;

class MemoryDsTest {

    @Test
    void testAddData() {
        MemoryDs memoryDs = new MemoryDs();
        memoryDs.addData("Hello");

        assertEquals("Hello", memoryDs.getData(0));
    }

    @Test
    void testGetData() {
        MemoryDs memoryDs = new MemoryDs();
        memoryDs.addData("Hello");
        memoryDs.addData("World");

        assertEquals("Hello", memoryDs.getData(0));
        assertEquals("World", memoryDs.getData(1));
    }

    @Test
    void testDelete() {
        MemoryDs memoryDs = new MemoryDs();
        memoryDs.addData("Hello");
        memoryDs.addData("World");

        memoryDs.delete(0);

        assertEquals("World", memoryDs.getData(0));
        assertEquals(1, memoryDs.getData().size());
    }
}