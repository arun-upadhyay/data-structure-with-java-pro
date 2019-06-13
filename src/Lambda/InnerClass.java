package Lambda;

import CollectionSort.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example of Inner Class
 */
public class InnerClass {

    // Person is a inner class here
    public class InnerClassPerson {
       private List<Person> persons = Arrays.asList(new Person("Arun", "105 Garden Dr", 30));

        public void setPersons(List<Person> persons) {
            this.persons = persons;
        }
        public List<Person> getPersons(){
            return this.persons;
        }
    }

    private static void printPersons(List<Person> persons){
        for(Person p:persons){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
       InnerClassPerson innerClassPerson = (new InnerClass()).new InnerClassPerson();
        printPersons(innerClassPerson.getPersons());
    }
}
