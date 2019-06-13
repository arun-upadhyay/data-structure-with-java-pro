/**
 * Singleton class
 */
class DatabaseObject {

    // static class variable
    private static DatabaseObject databaseObject = null;

    // avoid creating object of this class
    private DatabaseObject() {
    }

    /**
     * get instance of a class
     * @return DatabaseObject
     */
    public static  DatabaseObject getInstance() {
        if (databaseObject == null) {
            databaseObject = new DatabaseObject();
        }
        return databaseObject;
    }


}

public class SingletonImplementation {
    public static void main(String[] args) {
        DatabaseObject databaseObject = DatabaseObject.getInstance();
        DatabaseObject databaseObject1 = DatabaseObject.getInstance();
        // compare two objects. They are equal if singleton.
        System.out.println(databaseObject.equals(databaseObject1));
    }
}
