package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.EMPTY_FILEPATH;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MEETING_TIME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MEETING_TIME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withRemark("").withNetWorth("$54400").withMeetingTime("10-08-2022 15:00")
            .withFilePath("src/test/data/TestPDFs/Test_PDF.pdf").withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25").withRemark("He can't take beer!")
            .withEmail("johnd@example.com").withPhone("98765432").withNetWorth("$1350")
            .withMeetingTime("11-04-2022 11:00")
            .withFilePath("src/test/data/TestPDFs/Test_PDF2.pdf").withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").withNetWorth("$444444400")
            .withMeetingTime("30-12-2023 10:00")
            .withFilePath("src/test/data/TestPDFs/Test_PDF3.pdf").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends")
            .withNetWorth("$7777")
            .withMeetingTime("01-01-2022 13:00").withFilePath("src/test/data/TestPDFs/Test_PDF4.pdf").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").withNetWorth("$888888")
            .withMeetingTime("06-10-2023 18:00")
            .withFilePath("src/test/data/TestPDFs/Test_PDF5.pdf").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withNetWorth("$11222333")
            .withMeetingTime("19-11-2024 02:00").withFilePath("src/test/data/TestPDFs/Test_PDF6.pdf").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").withNetWorth("$1000")
            .withMeetingTime("15-06-2022 17:00").withFilePath("src/test/data/TestPDFs/Test_PDF7.pdf").build();
    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withNetWorth("$2990")
            .withMeetingTime("28-07-2020 15:00").withFilePath("src/test/data/TestPDFs/Test_PDF6.pdf").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withNetWorth("$399999")
            .withMeetingTime("14-03-2023 16:00").withFilePath("src/test/data/TestPDFs/Test_PDF7.pdf").build();
    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withNetWorth("$1350")
            .withMeetingTime(VALID_MEETING_TIME_AMY).withFilePath(EMPTY_FILEPATH).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withNetWorth("$53000")
            .withMeetingTime(VALID_MEETING_TIME_BOB).withFilePath(EMPTY_FILEPATH)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER
    private TypicalPersons() {} // prevents instantiation
    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }
    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
