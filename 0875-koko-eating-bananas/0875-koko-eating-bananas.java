class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=findMax(piles);
        
        int low=1;
        while(low<=high){
             int mid=low+(high-low)/2;
            int totalH=calculateTotalHours(piles,mid);
           
            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            return low;
    }
        
    
        
 public static int findMax(int []piles){
            int maxi=Integer.MIN_VALUE;
            int n=piles.length;
            for(int i=0;i<n;i++){
                maxi=Math.max(maxi,piles[i]);
            }
            return maxi;
        }
        
       
       
        public static int calculateTotalHours(int[] piles,int h){
            int totalH=0;
            int n=piles.length;
            for(int i=0;i<n;i++){
                totalH+=Math.ceil((double)piles[i]/(double)h);
            }
            return totalH;
            
        }
}
