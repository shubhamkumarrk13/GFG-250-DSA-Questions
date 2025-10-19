// Problem Link : https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

class Solution {
    
    public static void zigZag(int[] arr) {
        
        int n = arr.length;
        
        boolean flag = true; // true -> ascending, false -> descending
        
        for(int i=0; i<n-1; i++) {
            
            if(flag == true && arr[i] > arr[i+1]) { // arr[i] and arr[i+1] must be in asecending if flag = true
                
                int temp = arr[i];
                
                arr[i] = arr[i+1];
                
                arr[i+1] = temp;
            }
            
            else if(flag == false && arr[i] < arr[i+1]) {// arr[i] and arr[i+1] must be in descending if flag = false
                
                int temp = arr[i];
                
                arr[i] = arr[i+1];
                
                arr[i+1] = temp;
            }
            
            flag = !flag;
        }
        
    }
}
