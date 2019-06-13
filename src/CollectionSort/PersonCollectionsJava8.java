package CollectionSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonCollectionsJava8 {
    static private List<Person> people;

    /**
     * List all the persons
     */
    private void listPersons() {
        for (Person person : people) {
            System.out.println(people);
        }
    }

    /**
     * print name with Preconditions applied.
     */
    private static void printPreConditionally(List<Person> people, IPersonTestName test) {
        for (Person p : people) {
            if (test.testName(p)) {
                System.out.println(p);
            }

        }
    }


    private static void printPreConditionally1(List<Person> people, Predicate<Person> test) {
        for (Person p : people) {
            if (test.test(p)) {
                System.out.println(p);
            }

        }
    }

    public static void main(String[] args) {
        PersonCollectionsJava8 cols = new PersonCollectionsJava8();
        people = Arrays.asList(
                new Person("Arun", "105 Garden Dr", 30),
                new Person("Mugus", "521 Pine Street", 31),
                new Person("Andrew", "431 Locus Street", 24)
        );

        System.out.println("List of Persons");
        cols.listPersons();
        // Sort compare (sort list using lambda expression)
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("List of persons after sorting by name");
        cols.listPersons();
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("List of persons after sorting by age");
        cols.listPersons();
        // Sort using list using address
        Collections.sort(people, (p1, p2) -> p1.getAddress().compareTo(p2.getAddress()));
        System.out.println("List of person after sorting by address");
        cols.listPersons();

        System.out.println("Print names starting with 'A'");
        // Use of Lambda expression to print the name.
        printPreConditionally(people, p -> p.getName().startsWith("A"));
    }
}
