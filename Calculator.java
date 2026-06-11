public class Calculator {

    private static int count = 0;

    public Calculator() {
        count++;
        System.out.println("Calculator object created. Count = " + count);
    }

    public static int getObjectCount() {
        return count;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public void printMessage() {
        System.out.println("Calculator Executed");
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 20));

        System.out.println("Subtraction: " + calculator.sub(15, 5));

        System.out.println("Multiplication: " + calculator.mul(5, 6));

        System.out.println("Division: " + calculator.div(15, 5));

        calculator.printMessage();

        System.out.println("Total Objects Created: "
                + Calculator.getObjectCount());
    }
}