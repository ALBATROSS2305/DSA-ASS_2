package ASSIGNMENT3;
import java.util.*;
public class Q4 {
    public static void main(String[] args)
    {
        Scanner albatross = new Scanner(System.in);
        System.out.println("Enter size array:");
        int s =  albatross.nextInt();
        System.out.println("Enter array elements:");
        Integer[] iarr = new Integer[s];
        for (int i = 0; i <  iarr.length; i++) 
            iarr[i] = albatross.nextInt();
        System.out.print("Integer Array contains:\n");
        printArray(iarr);
        System.out.println("Enter array elements:");
        Double[] darr = new Double[s];
        for (int i = 0; i <  darr.length; i++) 
            darr[i] = albatross.nextDouble();
        System.out.print("Double Array contains:\n");
        printArray(darr);        
    }
    public static <E> void printArray(E[] inputArray) 
    {
        for (int i=0;i<inputArray.length;i++) 
            System.out.print(inputArray[i] + " ");
        System.out.println();
    }
}
