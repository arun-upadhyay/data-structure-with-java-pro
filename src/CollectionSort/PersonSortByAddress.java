package CollectionSort;

import java.util.Comparator;

/**
 * Sort Persons by address
 */
public class PersonSortByAddress implements Comparator<Person> {
    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public int compare(Person p1, Person p2){
        return p1.getAddress().compareTo(p2.getAddress());

    }
}
