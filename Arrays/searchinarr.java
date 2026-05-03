package Arrays;

import java.util.Scanner;

//Find the target element in the array and return it
public class searchinarr {
    public static void main(String[] args){
        int[] a = {2,4,5,6,7,8,9,11};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target element you want to search");
        int target = s.nextInt();
        //Implementing linear search that is traversing the array from the beginning one by one
        for(int i=0; i<a.length; i++){
            if(a[i] == target){
                System.out.println("The index of target is: "+ i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}
