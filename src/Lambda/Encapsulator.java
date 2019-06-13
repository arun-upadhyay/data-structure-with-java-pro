package Lambda;

// AdderInterface
interface AdderInterface {
    int add(int a, int b);
}
// Encapsulate class
class Encapsulator {
    static AdderInterface addrInterface = (a, b) -> {
        return a + b;
    };

    public static void main(String[] args) {
        System.out.println(addrInterface.add(1, 2));
    }
}