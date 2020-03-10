package AddressBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddressBookTest {
  @Test
  void getPersons() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add two persons
    addressBook.add(new Person("firstName1", "lastName1", "address1",
        "city1", "state1", "zip1", "phone1"));

    addressBook.add(new Person("firstName2", "lastName2", "address2",
        "city2", "state2", "zip2", "phone2"));

    // create array of expected persons
    final Person[] expected = new Person[]
        {
            new Person("firstName1", "lastName1", "address1", "city1",
                "state1", "zip1", "phone1"),

            new Person("firstName2", "lastName2", "address2", "city2",
                "state2", "zip2", "phone2")
        };

    // get actual array of persons
    final Person[] actual = addressBook.getPersons();

    // compare the actual to the expected
    assertEquals(actual, expected);
  }

  @Test
  void add() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // get expected person
    final Person expected = addressBook.get(0);

    // make sure the person is not null
    assertNotNull(expected);
  }

  @Test
  void set() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // create an expected person
    final Person expected = new Person("newFirstName", "newLastName",
        "newAddress", "newCity", "newState", "newZip", "newPhone");

    // set original person to expected person
    addressBook.set(0, expected);

    // get actual person
    final Person actual = addressBook.get(0);

    // compare the actual to the expected
    assertEquals(actual, expected);
  }

  @Test
  void remove() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // remove person
    addressBook.remove(0);

    // get actual person
    final Person actual = addressBook.get(0);

    // make sure the person is null
    assertNull(actual);
  }

  @Test
  void get() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // get actual person
    final Person actual = addressBook.get(0);

    // make sure the person is not null
    assertNotNull(actual);
  }

  @Test
  void clear() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // create expected person array
    final Person[] expected = new Person[] { };

    // clear person array
    addressBook.clear();

    // get actual person array
    final Person[] actual = addressBook.getPersons();

    // compare the actual to the expected
    assertEquals(actual, expected);
  }

  @Test
  void getRowCount() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // create expected row count
    final int expected = 1;

    // get actual row count
    final int actual = addressBook.getRowCount();

    // compare the actual to the expected
    assertEquals(actual, expected);
  }

  @Test
  void getColumnCount() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // create expected column count
    final int expected = 7;

    // get actual column count
    final int actual = addressBook.getColumnCount();

    // compare the actual to the expected
    assertEquals(actual, expected);
  }

  @Test
  void getValueAt() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // get actual value
    final Object actual = addressBook.getValueAt(0, 0);

    // make sure the value is not null
    assertNotNull(actual);
  }

  @Test
  void getColumnName() {
    // create address book
    AddressBook addressBook = new AddressBook();

    // add a person
    addressBook.add(new Person("firstName", "lastName", "address",
        "city", "state", "zip", "phone"));

    // get actual value
    final String actual = addressBook.getColumnName(0);

    // make sure the value is not null
    assertNotNull(actual);
  }
}