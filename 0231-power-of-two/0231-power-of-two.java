class Solution {
    public boolean isPowerOfTwo(int n) {
     
for(int i=0;i<=31;i++){
    double pow=Math.pow(2,i);
    if(pow==n){
        return true;
        
    }
}
return false;
    }
}