package AddressBook

import AddressBook.Person

class PersonTest extends GroovyTestCase {
    void setUp() {
        super.setUp()
    }

    void tearDown() {

    }

    void testGetFirstName() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getFirstName(), expected)
    }

    void testGetLastName() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getLastName(), expected)
    }

    void testGetAddress() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getAddress(), expected)
    }

    void testGetCity() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getCity(), expected)
    }

    void testGetState() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getState(), expected)
    }

    void testGetZip() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getZip(), expected)
    }

    void testGetPhone() {
        def person = new Person('123', '123', '123', '123', '123', '123', '123')
        def expected = '123'
        assertEquals(person.getPhone(), expected)
    }

    void testToString() {
    }

    void testContainsString() {
    }

    void testGetField() {
    }
}
