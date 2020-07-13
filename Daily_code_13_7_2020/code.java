
/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6]. */

class code { 
    static void productArray(int arr[]) 
    { 
        int n = arr.length;
 
        if (n == 1) { 
            System.out.print("0"); 
            return; 
        } 
  
        int i ;
        int temp = 1; 
  
        int product[] = new int[n]; 
  
        for (int j = 0; j < n; j++) 
            product[j] = 1; 
  
        for (i = 0; i < n; i++) { 
            product[i] = temp; 
            temp = arr[i] * temp; 
        } 

        temp = 1; 
  
        for (i = n - 1; i >= 0; i--) { 
            product[i] = temp * product[i]; 
            temp = arr[i] * temp; 
        } 
  
        for (i = 0; i < n; i++) {
            System.out.print(product[i] + " "); 
        }

        return; 
    } 
  
    public static void main(String[] args) 
    {  
        int arr[] = { 50,42,65,3,23,8,90,-40,25,16,25,34,12,11,32,33,11,17 }; 
        int n = arr.length; 
        System.out.println("The resulting array is "); 
        productArray(arr); 
        System.out.println("");
    } 
} 