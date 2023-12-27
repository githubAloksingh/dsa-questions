class Solution {
    public int minCost(String colors, int[] neededTime) {
        int mini=0;
        int maxi=0;
        colors.toCharArray();
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                mini+=Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
                
            }
            
        }
        return mini;
        
    }
}