class Solution {
    public int numberOfSteps(int num) {
        int val=num;
        int cnt=0;
        while(val!=0){
        if(val%2==0){
            val=val/2;
            cnt++;
        }
            else if(val%2!=0){
                val-=1;
                cnt++;
            }
        }
        return cnt;
        
    }
}