class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();
        for(char ch: magazine.toCharArray()){
            magazineCount.put(ch,magazineCount.getOrDefault(ch,0)+1);
        }
        for(char ch: ransomNote.toCharArray()){
            if(!magazineCount.containsKey(ch)|| magazineCount.get(ch)<=0){
                return false;

            }
            magazineCount.put(ch,magazineCount.get(ch)-1);
            
        }
        return true;
        
    }
}


