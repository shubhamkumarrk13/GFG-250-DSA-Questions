// Problem Link : https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        long n = arr.length; // length of array
        
        long sn = (n * (n+1)) / 2; // sum of n natural numbers
        
        long s2n = (n*(n+1)*(2*n + 1)) / 6; // sum of square of n natural numbers
        
        long s = 0;
        
        long s2 = 0;
        
        for(int i=0; i<n; i++) {
            
            s = s + (long)arr[i];
            
            s2 = s2 + ((long)arr[i] * (long)arr[i]);
        }
        
        long val1 = s - sn; // val1 = x - y
        
        long val2 = s2 - s2n; // val2 = x^2 - y^2 = (x + y)(x - y)
        
        val2 = val2 / val1; // val2 = (x + y)
        
        long x = (val1 + val2) / 2;
        
        long y = val2 - x;
        
        result.add((int)x);
        
        result.add((int)y);
        
        return result;
        
        
    }
}



