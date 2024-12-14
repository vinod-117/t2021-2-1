import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = scanner.next().toLowerCase();

        float result;
        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
        }

        scanner.close();
    }
}