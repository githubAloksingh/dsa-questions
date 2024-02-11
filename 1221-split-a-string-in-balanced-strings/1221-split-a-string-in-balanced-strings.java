class Solution {
    public int balancedStringSplit(String s) {
        int balanceStrings=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                balanceStrings++;
            }
        }
        return balanceStrings;
    }
}