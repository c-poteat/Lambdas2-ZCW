import java.util.List;

public class Anonymous implements CheckPerson {

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        if (p.age == p.getAge()) {
            return true;
        } else {
            return false;
        }
    }
}
