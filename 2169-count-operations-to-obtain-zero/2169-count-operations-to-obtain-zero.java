class Solution {
    public int countOperations(int num1, int num2) {
       
        int ans=check(num1,num2,0);
        return ans;
        
    }
    public int check(int num1,int num2,int cnt){
        if(num1==0 || num2==0){
            return cnt;
        }
        if(num1>num2){
            return check(num1-num2,num2,cnt+1);
        }
        else{
            return check(num1,num2-num1,cnt+1);
        }
        
    }
}
