package CollectionSort;

import java.util.Comparator;

/**
 * Sort persons by Age.
 */
public class PersonSortByAge implements Comparator<Person> {
    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
