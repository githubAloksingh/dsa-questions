class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character>al =new ArrayList<>();
        int count=0;
    for(char jewel :jewels.toCharArray()){
        al.add(jewel);
        
    }
        for(char stone:stones.toCharArray()){
            if(al.contains(stone)){
                count++;
            }
        }
        return count;
    }
}