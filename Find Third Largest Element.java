// Problem Link : https://www.geeksforgeeks.org/problems/third-largest-element/1

class Solution {
    
    int thirdLargest(int arr[]) {
        
        if(arr.length < 3) return -1;
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int ele : arr) {
            
            if(ele > first) {
                
                third = second;
                
                second = first;
                
                first = ele;
            }
            
            else if(ele > second) {
                
                third = second;
                
                second = ele;
            }
            
            else if(ele > third) {
                
                third = ele;
            }
        }
        
        return third;
        
    }
}
