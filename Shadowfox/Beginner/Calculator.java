import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean continueCalculation = true;
        
        while (continueCalculation) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversion");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> calculator.basicArithmetic();
                case 2 -> calculator.scientificCalculations();
                case 3 -> calculator.unitConversions();
                case 4 -> continueCalculation = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the Calculator!");
    }

    private void basicArithmetic() {
        System.out.println("\nSelect Arithmetic Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation = scanner.nextInt();
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case 1 -> System.out.println("Result: " + add(num1, num2));
            case 2 -> System.out.println("Result: " + subtract(num1, num2));
            case 3 -> System.out.println("Result: " + multiply(num1, num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
            }
            default -> System.out.println("Invalid operation.");
        }
    }

    private void scientificCalculations() {
        System.out.println("\nSelect Scientific Calculation:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter number:");
                double num = scanner.nextDouble();
                System.out.println("Result: " + Math.sqrt(num));
            }
            case 2 -> {
                System.out.println("Enter base:");
                double base = scanner.nextDouble();
                System.out.println("Enter exponent:");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exponent));
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    private void unitConversions() {
        System.out.println("\nSelect Unit Conversion:");
        System.out.println("1. Temperature (Celsius <-> Fahrenheit)");
        System.out.println("2. Currency (USD <-> INR)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> temperatureConversion();
            case 2 -> currencyConversion();
            default -> System.out.println("Invalid choice.");
        }
    }

    private void temperatureConversion() {
        System.out.println("\nSelect Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + celsiusToFahrenheit(temp) + " °F");
            case 2 -> System.out.println("Result: " + fahrenheitToCelsius(temp) + " °C");
            default -> System.out.println("Invalid choice.");
        }
    }

    private void currencyConversion() {
        System.out.println("\nSelect Currency Conversion:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        int choice = scanner.nextInt();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        double conversionRate = 82.0; // Example static rate for USD to INR

        switch (choice) {
            case 1 -> System.out.println("Result: ₹" + (amount * conversionRate));
            case 2 -> System.out.println("Result: $" + (amount / conversionRate));
            default -> System.out.println("Invalid choice.");
        }
    }

    // Basic Arithmetic Methods
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    // Temperature Conversion Methods
    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
