class Solution {
    public int mySqrt(int x) {
        long ans=0;
        for(long i=1;i<=x;i++){
            long val=i*i;
            if(val <= (long)x){
                ans=i;
                
            }
            else{
                break;
            }
        }
        return (int)ans;
    }
}

 