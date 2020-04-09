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
        Person failedPerson;
        IllegalArgumentException thrown;

        // Branch coverage of the Person constructor
        thrown = assertThrows(IllegalArgumentException.class, () -> new Person(null, "Karish", null, null, null, null, null));
        assertEquals("First name cannot be empty", thrown.getMessage());

        thrown = assertThrows(IllegalArgumentException.class, () -> new Person("Robert", null, null, null, null, null, null));
        assertEquals("Last name cannot be empty", thrown.getMessage());

        thrown = assertThrows(IllegalArgumentException.class, () -> new Person("", "Karish", null, null, null, null, null));
        assertEquals("First name cannot be empty", thrown.getMessage());

        thrown = assertThrows(IllegalArgumentException.class, () -> new Person("Robert", "", null, null, null, null, null));
        assertEquals("Last name cannot be empty", thrown.getMessage());
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
        assertTrue(p.containsString("Robert"));
        assertTrue(p.containsString("Karish"));
        assertTrue(p.containsString("12345 Bonita Landing Circle"));
        assertTrue(p.containsString("Bonita Springs"));
        assertTrue(p.containsString("FL"));
        assertTrue(p.containsString("12345"));
        assertTrue(p.containsString("239-821-1466"));
    }

    @Test
    void getFieldTest() {
        // Test the getField method
        String name = "Robert";
        String lastName = "Karish";
        String address = "12345 Bonita Landing Circle";
        String city = "Bonita Springs";
        String state = "FL";
        String zip = "12345";
        String phone = "239-821-1466";
        assertEquals(name, p.getField(1));
        assertEquals(lastName, p.getField(0));
        assertEquals(address, p.getField(2));
        assertEquals(city, p.getField(3));
        assertEquals(state, p.getField(4));
        assertEquals(zip, p.getField(5));
        assertEquals(phone, p.getField(6));
    }

    @Test
    void negativeTest_personFirstNameEmpty(){
        assertThrows(IllegalArgumentException.class, ()-> new Person("", "person",
                "street", "city", "state", "zip", "phone"));
    }

    @Test
    void negativeTest_personFirstNameNull(){
        assertThrows(IllegalArgumentException.class, ()-> new Person(null, "person",
                "street", "city", "state", "zip", "phone"));
    }

    @Test
    void negativeTest_personLastNameEmpty(){
        assertThrows(IllegalArgumentException.class, ()-> new Person("test", "",
                "street", "city", "state", "zip", "phone"));
    }

    @Test
    void negativeTest_personLastNameNull(){
        assertThrows(IllegalArgumentException.class, ()-> new Person("test", null,
                "street", "city", "state", "zip", "phone"));
    }
}
