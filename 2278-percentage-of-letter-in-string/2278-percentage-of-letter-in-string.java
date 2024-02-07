class Solution {
    public int percentageLetter(String s, char letter) {
        int stringLength=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < stringLength; i++) {
           char ch = s.charAt(i);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
         }
       
        if(map.containsKey(letter)){
            int value=map.get(letter);
            double percentage=((double)value / stringLength)*100;
            return (int)Math.floor(percentage);
        }
        return 0;
        
        
    }
}
