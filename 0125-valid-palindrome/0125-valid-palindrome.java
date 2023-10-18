class Solution {
    public boolean isPalindrome(String s) {
          s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}