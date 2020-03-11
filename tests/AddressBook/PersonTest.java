package AddressBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person p;

    @BeforeEach
    void setUp() {
        // Make a new Person before each test case
        p = new Person("Robert", "Karish", "12345 Bonita Landing Circle", "Bonita Springs", "FL", "12345", "239-821-1466");

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getFirstNameTest() {
        // Test the getFirstName method
        String firstName = "Robert";
        assertEquals(p.getFirstName(), firstName);
    }

    @Test
    void getLastNameTest() {
        // Test the getLastName method
        String lastName = "Karish";
        assertEquals(p.getLastName(), lastName);
    }

    @Test
    void getAddressTest() {
        // Test the getAddress method
        String address = "12345 Bonita Landing Circle";
        assertEquals(address,p.getAddress());
    }

    @Test
    void getCityTest() {
        // Test the getCity method
        String city = "Bonita Springs";
        assertEquals(city, p.getCity());
    }

    @Test
    void getStateTest() {
        // Test the getState method
        String state = "FL";
        assertEquals(state, p.getState());
    }

    @Test
    void getZipTest() {
        // Test the getZip method
        String zip = "12345";
        assertEquals(zip, p.getZip());
    }

    @Test
    void getPhoneTest() {
        // Test the getPhone method
        String phone = "239-821-1466";
        assertEquals(phone, p.getPhone());
    }

    @Test
    void toStringTest() {
        // Test the toString method
        String toString = "Karish, Robert";
        assertEquals(toString, p.toString());
    }

    @Test
    void containsStringTest() {
        // Test the containsString method
        assertEquals(true, p.containsString("Robert"));
    }

    @Test
    void getFieldTest() {
        // Test the getField method
        String name = "Robert";
        assertEquals(name, p.getField(1));
    }
}
