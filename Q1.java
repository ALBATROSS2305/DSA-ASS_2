package ASSIGNMENT3;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner albatross = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        try {
            int luckyNumber = Integer.parseInt(albatross.nextLine());
            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative Number");
            }
            System.out.println("Your lucky number is: " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}