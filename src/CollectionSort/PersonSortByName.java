package CollectionSort;

import java.util.Comparator;

/**
 * Sort Person by name.
 */
public class PersonSortByName implements Comparator<Person> {
    /**
     * Implements compare method
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());

    }
}
