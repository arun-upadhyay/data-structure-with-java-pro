/**
 * Immutable class. Values within this cannot be changed.
 * Class must be declared as final (So that child classes can’t be created)
 * Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
 * A parameterized constructor
 * Getter method for all the variables in it
 * No setters(To not have option to change the value of the instance variable)
 * Example of Immutable class: String, Boolean, Integer, Byte, Short
 */
public final class ImmutableClass {
    private String value;

    // Constructor
    ImmutableClass(String value) {
        this.value = value;
    }

    // Only getter, no setter.
    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Immutable");
        System.out.println(immutableClass.getValue());

    }
}
