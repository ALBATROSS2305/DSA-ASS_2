package ASSIGNMENT3;
import java.util.*;
public class Q8 {
   
        public static void main(String[] args) {
            Scanner albatross = new Scanner(System.in);
            System.out.print("Write the number thats you want to reverse: ");
            int number =albatross.nextInt() ;
            System.out.print("Original number: " + number + "\nReversed number: ");
            reverseDigits(number);
        }
    
        public static void reverseDigits(int number) {
            if (number < 10) {
                System.out.print(number);
                return;
            }
            System.out.print(number % 10); 
            reverseDigits(number / 10);
        }
    }
    