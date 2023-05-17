package ASSIGNMENT3;
import java.util.*;
public class Q10
{
    public static void main(String[] args) {
        Scanner albatross = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = albatross.nextLine();
        String reversedString = reverseString(s);
        System.out.println("Original string: " + s+"\nReversed string: " + reversedString);
    }

    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            char lastChar = s.charAt(s.length() - 1); 
            String remainingString = s.substring(0, s.length() - 1);
            return lastChar + reverseString(remainingString);
        }
    }
}
