package Arrays;

import java.util.Scanner;

//Find sum of all elements in the array
//Ask the user for size, elements of the array and then calculate sum and return the sum.
public class sumarr {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++){
            a[i] = s.nextInt();
        }
        int sum = 0;
        for(int x: a){
            sum = sum + x;
        }
        System.out.println("Sum of elements in the array: "+sum);
    }
}
