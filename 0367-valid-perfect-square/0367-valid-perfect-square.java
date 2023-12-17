class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i=1;i<=num;i++){
            long val=i*i;
            if((i*i)==num){
                return true;
            }
            else if((i*i)>num){
                break;
            }
            
        }
        return false;
        
    }
}