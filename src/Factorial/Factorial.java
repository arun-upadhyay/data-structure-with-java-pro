package Factorial;

/**
 * Find the factorial of integer number
 */
public class Factorial {

    int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * (fact(n - 1));
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Factorial fact = new Factorial();
        System.out.println("Factorial : " + fact.fact(5));
        long endTime = System.currentTimeMillis();
        System.out.println("BenchMark = " + (endTime - startTime));
    }
}
