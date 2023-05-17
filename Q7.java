package ASSIGNMENT3;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner albatross = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----- Mathematical Operations -----");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine X^N for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Binary equivalent of a decimal number");
            System.out.println("5. Product of two numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = albatross.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int factorialNumber = albatross.nextInt();
                    long factorialResult = factorial(factorialNumber);
                    System.out.println("Factorial of " + factorialNumber + " = " + factorialResult);
                    break;
                case 2:
                    System.out.print("Enter the base (X): ");
                    int base = albatross.nextInt();
                    System.out.print("Enter the exponent (N): ");
                    int exponent = albatross.nextInt();
                    long powerResult = power(base, exponent);
                    System.out.println(base + "^" + exponent + " = " + powerResult);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int num1 = albatross.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = albatross.nextInt();
                    int gcdResult = gcd(num1, num2);
                    System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcdResult);
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = albatross.nextInt();
                    String binaryEquivalent = decimalToBinary(decimalNumber);
                    System.out.println("Binary equivalent of " + decimalNumber + " = " + binaryEquivalent);
                    break;
                case 5:
                    System.out.print("Enter the first number: ");
                    int firstNumber = albatross.nextInt();
                    System.out.print("Enter the second number: ");
                    int secondNumber = albatross.nextInt();
                    long productResult = multiply(firstNumber, secondNumber);
                    System.out.println("Product of " + firstNumber + " and " + secondNumber + " = " + productResult);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        albatross.close();
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0)
            return "0";
        else if (decimalNumber == 1)
            return "1";
        else
            return decimalToBinary(decimalNumber / 2) + (decimalNumber % 2);
    }

    public static long multiply(int num1, int num2) {
        if (num2 == 0)
            return 0;
        else
            return num1 + multiply(num1, num2 - 1);
    }
}