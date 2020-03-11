package AddressBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person p;

    @BeforeEach
    void setUp() {
        p = new Person("Robert", "Karish", "12345 Bonita Landing Circle", "Bonita Springs", "FL", "12345", "239-821-1466");

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getFirstNameTest() {
        String firstName = "Robert";
        assertEquals(p.getFirstName(), firstName);
    }

    @Test
    void getLastNameTest() {
        String lastName = "Karish";
        assertEquals(p.getLastName(), lastName);
    }

    @Test
    void getAddressTest() {
        String address = "12345 Bonita Landing Circle";
        assertEquals(address,p.getAddress());
    }

    @Test
    void getCityTest() {
        String city = "Bonita Springs";
        assertEquals(city, p.getCity());
    }

    @Test
    void getStateTest() {
        String state = "FL";
        assertEquals(state, p.getState());
    }

    @Test
    void getZipTest() {
        String zip = "12345";
        assertEquals(zip, p.getZip());
    }

    @Test
    void getPhoneTest() {
        String phone = "239-821-1466";
        assertEquals(phone, p.getPhone());
    }

    @Test
    void toStringTest() {
        String toString = "Karish, Robert";
        assertEquals(toString, p.toString());
    }

    @Test
    void containsStringTest() {
        assertEquals(true, p.containsString("Robert"));
    }

    @Test
    void getFieldTest() {
        String name = "Robert";
        assertEquals(name, p.getField(1));
    }
}
