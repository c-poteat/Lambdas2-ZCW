import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private List<Person> newPersonGenerator;
    String emailAddress;
    String birthday;
    String name;
    Sex gender;
    int age;

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public Person(String emailAddress, String birthday, String name, Sex gender, int age, ArrayList newPersonGenerator) {
        this.newPersonGenerator = newPersonGenerator;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Person() {

    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
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

    @Override
    public String toString(){
      return null;
    }
}
