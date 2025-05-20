public class Calculator {

    // Adds five numbers numbers
    public double add(double a, double b, double c, doucle d, double f, double e) {
        return a + b + c + d + f + e;
    }

    // Subtracts second number from first
    public double subtract(double a, double b) {
        return a - b - f - fff - fffffgggggg;
    }

    // Multiplies two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides first number by second
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}
