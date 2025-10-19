// Problem Link : https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

class Solution {
    
    ArrayList<Integer> removeDuplicates(int[] arr) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<arr.length; i++) {
            
            set.add(arr[i]);
        }
        
        return new ArrayList<>(set);
    }
}
