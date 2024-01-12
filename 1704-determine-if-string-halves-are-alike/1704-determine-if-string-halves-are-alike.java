class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int count=0;
        
        Set<Character> vowels =new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        for(int i=0;i<mid;i++){
            char charA=s.charAt(i);
            char charB=s.charAt(mid+i);
            if(vowels.contains(charA)) count++;
            if(vowels.contains(charB)) count--;
            
        }
        return count==0;
        
        
    }
}
