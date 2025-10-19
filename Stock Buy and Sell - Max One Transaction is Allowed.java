// Problem Link : https://www.geeksforgeeks.org/problems/buy-stock-2/1

class Solution {
    public int maximumProfit(int prices[]) {
        
        
        int profit = 0;
        
        int cost = prices[0]; // intial cost
        
        for(int i=1; i<prices.length; i++) {
            
            if(prices[i] > cost) {
                
                profit = Math.max(profit, prices[i] - cost);
            }
            
            cost = Math.min(cost, prices[i]);
        }
        
        return profit;
    }
}
