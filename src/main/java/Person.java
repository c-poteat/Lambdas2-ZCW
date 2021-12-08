import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String emailAddress;
    LocalDate birthday;
    String name;
    Sex gender;
    int age;

    public Person(String emailAddress, LocalDate birthday, String name, Sex gender, int age) {
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public List<Person> getNewPersonGenerator() {
        return newPersonGenerator;
    }

    public void setNewPersonGenerator(List<Person> newPersonGenerator) {
        this.newPersonGenerator = newPersonGenerator;
    }

    private List<Person> newPersonGenerator = new ArrayList<Person>();

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
