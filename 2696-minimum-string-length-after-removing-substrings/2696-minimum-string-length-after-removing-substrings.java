class Solution {
    public int minLength(String s) {
        boolean found = true;
        while(found){
            String temp=s;
            s=s.replace("AB","").replace("CD","");
        
            found=!s.equals(temp);
        }
        return s.length();
        
    }
}