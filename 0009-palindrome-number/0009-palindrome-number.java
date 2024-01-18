class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        long reversed=0;
        int temp=x;
        while(temp!=0){
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp/=10;
        }
        return reversed==x;
        
    }
}