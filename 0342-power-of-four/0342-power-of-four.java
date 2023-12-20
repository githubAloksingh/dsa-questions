class Solution {
    public boolean isPowerOfFour(int n) {
     
for(int i=0;i<=15;i++){
    double pow=Math.pow(4,i);
    if(pow==n){
        return true;
        
    }
}
return false;
    }
}