package CollectionSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Java7 Inner class example.
 */
public class PersonCollectionsJava7 {
    // person list
    static private List<Person> people;

    private void listPersons() {
        for (Person person : people) {
            System.out.println(people);
        }

    }

    private static void printPreconditionally(List<Person> people, IPersonTestName test) {
        for (Person p : people) {
            if (test.testName(p)) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        PersonCollectionsJava7 cols = new PersonCollectionsJava7();
        people = Arrays.asList(
                new Person("Arun", "105 Garden Dr", 30),
                new Person("Mugus", "521 Pine Street", 31),
                new Person("Andrew", "431 Locus Street", 24)
        );
        cols.listPersons();
        // Sort persons by age.
        Collections.sort(people, new PersonSortByAge());
        cols.listPersons();
        // sort persons by name
        Collections.sort(people, new PersonSortByAddress());
        cols.listPersons();
        // sort Person by address
        Collections.sort(people, new PersonSortByAddress());
        cols.listPersons();

        // printing list of person using Inner class.
        // Testing of name
        System.out.println("Printing names starting with 'A'");
        printPreconditionally(people, new IPersonTestName() {
            @Override
            public boolean testName(Person p) {
                if (p.getName().startsWith("A")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}
