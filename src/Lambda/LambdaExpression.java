package Lambda;

interface  Operation{
    void show(int a);
}
public class LambdaExpression {

    public static void main(String[] args) {

        // Lambda expression`
        Operation op = (int a)-> System.out.println("Hello Java -- Lambda expression: " + a);
        op.show(1);
        // Lambda expression ( another way)
        Operation op1 = a-> System.out.println("Hello Java -- Lambda expression: " + a);
        op.show(2);
        // anonymous  inner class
        Operation op2 = new Operation() {
            @Override
            public void show(int a) {
                System.out.println("Hello Java -- Inner Class"+a);
            }
        };
        op2.show(1);

    }

}
