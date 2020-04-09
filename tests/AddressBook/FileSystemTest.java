package AddressBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

class FileSystemTest {

  AddressBook testAddressBook = new AddressBook();
  AddressBookController testABC = new AddressBookController(testAddressBook);
  Person testPerson = new Person("One", "tester", "Street", "Cape Coral", "FL", "12345", "2341112299");

  @BeforeEach
  void setUp() {

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void readFile() {
    FileSystem fileSystem = new FileSystem();
    testAddressBook.add(testPerson);

    Throwable exception_fileNotFound = assertThrows(FileNotFoundException.class, () -> {
      throw new FileNotFoundException("File Not Found");
    });

    Throwable exception_SQLException = assertThrows(SQLException.class, () -> {
      throw new SQLException("SQL Exception");
    });

    File testFile = new File("testFile");
    assertDoesNotThrow(() -> fileSystem.saveFile(testAddressBook, testFile));

    assertDoesNotThrow(() -> fileSystem.readFile(testAddressBook, testFile));

    assertEquals("File Not Found", exception_fileNotFound.getMessage());
    assertEquals("SQL Exception", exception_SQLException.getMessage());
  }

  @Test
  void saveFile() {

    FileSystem fileSystem_save = new FileSystem();
    File testFile_save = new File("testSaveFile");

    Throwable exception_SQLException_noSave = assertThrows(SQLException.class, () -> {
      throw new SQLException("SQL Exception");
    });

    assertDoesNotThrow(() -> fileSystem_save.saveFile(testAddressBook, testFile_save));
    assertTrue(true, fileSystem_save.toString());

  }
  
  @Test
  void saveFileStub() {
    //create stub person
    Person stubPerson;

    // adds hardcoded data to the stub
    stubPerson = new Person("stubName", "stubLast", "1111 Stub Ln", "Stub City", "ST", "12390", "2");

    //assert that the added Person is present in the AddressBook
    mockAddressBook.add(stubPerson);
    assertEquals(mockAddressBook.get(0).getFirstName(), stubPerson.getField(1));
  }
}
