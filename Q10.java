package ASSIGNMENT3;
import java.util.*;
public class Q10
{
    public static void main(String[] args) 
    {
        Scanner albatross = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = albatross.nextLine();
        System.out.println("Reversed string: " +  reverse(s));

    }
    public static String reverse(String s) {
        if (s.isEmpty()) 
            return s;
        
            return reverse(s.substring(1)) + s.charAt(0);
    }
    
}