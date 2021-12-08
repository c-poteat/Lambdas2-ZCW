import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void setNewPersonGenerator() {

    }

    @Test
    public void setEmailAddress() {
        // Given
        Person person = new Person();
        String expected = "lambdahacker@gmail.com";

        // When
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setBirthday() {
        // Given
        Person person = new Person();
        String expected = "11/01/1983";

        // When
        person.setBirthday(expected);
        String actual = person.getBirthday();

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setName() {
        // Given
        Person person = new Person();
        String expected = "Jonathan";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setAge() {
        // Given
        Person person = new Person();
        int expected = 26;

        // When
        person.setAge(expected);
        int actual = person.getAge();

        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = null;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructor() {
        // Given
        Person person = new Person();
        String expectedEmailAddress = "jonathan@yahoo.com";
        String exptectedBirthday = "11/01/1983";
        String expectedName = "John Green";
        Person.Sex expectedGender1 = Person.Sex.MALE;
        Person.Sex expectedGender2 = Person.Sex.FEMALE;
        int expectedAge = 38;

        // When
        person.setEmailAddress(expectedEmailAddress);
        person.setBirthday(exptectedBirthday);
        person.setName(expectedName);
        person.setAge(expectedAge);
        person.setGender(expectedGender1);
        person.setGender(expectedGender2);

        // Then
        String actualEmailAddress = person.getEmailAddress();
        String actualBirthday = person.getBirthday();
        Person.Sex actualGender1 = person.getGender();
        Person.Sex actualGender2 = person.getGender();
        String actualName = person.getName();
        int actualAge = person.getAge();

        Assert.assertEquals(expectedEmailAddress, actualEmailAddress);
        Assert.assertEquals(exptectedBirthday, actualBirthday);
        Assert.assertEquals(expectedGender1, actualGender1);
        Assert.assertEquals(expectedGender2, actualGender2);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testToString() {
    }
}