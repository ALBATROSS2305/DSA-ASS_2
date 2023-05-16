package ASSIGNMENT3;
import java.util.*;
public class Q5 {
    public static void main(String[] args) 
    {
        Scanner albatross=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("Enter array elements ");
        for(int i=0;i<arr.length;i++)
            arr[i]=albatross.nextInt();
        System.out.println("Enter the element to search ");
        int k=albatross.nextInt();
        System.out.println("Number of times "+k+" present in the array is "+count(arr, k));
    }
    public static <T> int count(T[] array,T item)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
            if (array[i].equals(item)) 
            count++;
        return count;
    }
    }
    