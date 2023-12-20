class Solution {
    public boolean isPowerOfThree(int n) {
        

     
for(int i=0;i<=23;i++){
    double pow=Math.pow(3,i);
    if(pow==n){
        return true;
        
    }
}
return false;
    }
}