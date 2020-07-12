import java.io.*; 
import java.util.HashSet; 
  
class code { 
    static void sumof2(int arr[], int sum) 
    {

        HashSet<Integer> prevno = new HashSet<Integer>(); 
        
        for (int i = 0; i < arr.length; ++i) { 

            int temp = sum - arr[i]; 
  
            if (prevno.contains(temp)) { 

                System.out.println( "Two numbers having a sum of "+ sum + " are " + arr[i] + " and " + temp ); 

            }

            prevno.add(arr[i]); 

        }

    } 
  
    public static void main(String[] args) 
    { 
        int num[] = { 50,0,42,65,3,23,8,90,-40,25,16,25,34,12,11,32,33,11,17 }; //Time complexity => O(n)
        int sum = 50;                                                           //Space complexity => O(n)
        sumof2(num, sum); 
    } 
}