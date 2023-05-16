package ASSIGNMENT3;
import java.util.*;
public class Q8 {
    static int ans=0;
    public static void main(String[] args) 
    {
        Scanner albatross = new Scanner(System.in);
        System.out.print("Enter the number that you want to reverse: ");
        int n = albatross.nextInt(); 
        System.out.print("The reverse of the given number is: ");
        reverseNumber(n);
    }

    public static void reverseNumber(int num) 
    {
        if (num < 10)
        {
            System.out.print(num);
            return;
        }
        else 
            System.out.print(num%10);
        reverseNumber(num/10);
    }
}