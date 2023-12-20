class Solution {
    public int buyChoco(int[] prices, int money) {
        
        //Solution 1
//         Arrays.sort(prices);
//         int sum=prices[0]+prices[1];
//         int diff=money-sum;
//         if(sum>money){
//             return money;
//         }
//         else if(sum<=money){
//             return diff;
//         }
//         return 0;
        
        //Solution 2
        int mini=Integer.MAX_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int sum=prices[i]+prices[j];
                    mini=Math.min(mini,sum);
                    
                }
            }
        }
        int diff=money-mini;
        if(diff>=0){
            return diff;
        }
        else{
            return money;
        }
    }
}
        
        
            
            
            
    