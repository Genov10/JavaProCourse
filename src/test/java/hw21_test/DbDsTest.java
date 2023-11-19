package hw21_test;

import org.junit.jupiter.api.Test;
import edu.hw21_testing.DS.DatabaseDs.DbDs;
import org.mockito.Mockito;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbDsTest {

    @Test
    void testAddData() {
        DbDs DbDsTestMock = Mockito.mock(DbDs.class);
        DbDsTestMock.addData("Hello");

        // Verify that the data is added to the database
        try (Statement statement = DbDsTestMock.getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM hw21.hw21")) {
            assertTrue(resultSet.next());
            assertEquals("Hello", resultSet.getString("name"));
        } catch (SQLException e) {
            fail("Unexpected error: " + e.getMessage());
        }
    }

    @Test
    void testGetData() {
        DbDs dbDs = new DbDs();
        dbDs.addData("Hello");
        dbDs.addData("World");

        // Verify that the data can be retrieved from the database
        assertEquals("Hello", dbDs.getData(0));
        assertEquals("World", dbDs.getData(1));
    }

    @Test
    void testDelete() {
        DbDs dbDs = new DbDs();
        dbDs.addData("Hello");
        dbDs.addData("World");

        // Verify that the data can be deleted from the database
        dbDs.delete(0);

        try (Statement statement = dbDs.getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM hw21.hw21")) {
            assertTrue(resultSet.next());
            assertEquals("World", resultSet.getString("name"));
            assertFalse(resultSet.next());
        } catch (SQLException e) {
            fail("Unexpected error: " + e.getMessage());
        }
    }
}