package Arrays;

import java.util.Scanner;

//Ask size of the array, ask for elements of the array, show the elements of array
public class firstarray {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}