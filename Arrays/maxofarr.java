package Arrays;
//max of array, create a tracker which points to first index of the array
//Start comparing each element of the array with the max
public class maxofarr {
    public static void main(String[] args){
       int[] arr = {2,4,5,6,9,3,1};
       int max = arr[0];
       for(int i=0; i<arr.length; i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
       System.out.println("Maximum value in array: "+max);
    }
}
