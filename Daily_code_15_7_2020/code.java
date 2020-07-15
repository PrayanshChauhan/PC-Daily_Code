/*Given an array of integers, find the first missing positive integer in linear time and constant space.

In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/



import java.io.*; 
import java.util.HashSet; 
  
class code { 
    static void leastpos (int arr[]) 
    {

        HashSet<Integer> pos = new HashSet<Integer>(); 
        
        for (int i = 0; i < arr.length; ++i) {

            if(arr[i] > 0){
                pos.add(arr[i]);
            }

        }
  
        int seq = 1;

        while(pos.contains(seq)){
            seq++;
        }

        System.out.println("The least positive number is " + seq);

    } 
  
    public static void main(String[] args) 
    { 
        int num[] = { 1, 2, 0 }; //Time complexity => O(n)
                                                                                //Space complexity => O(n)
        leastpos(num); 
    } 
}