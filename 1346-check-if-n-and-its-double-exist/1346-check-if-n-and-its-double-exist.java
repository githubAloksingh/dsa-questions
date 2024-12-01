class Solution {
    public boolean checkIfExist(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        for(int num:arr){
            if((num%2==0) && hash.contains(num/2) || hash.contains(num*2)){
                return true;
            }
            hash.add(num);
        }
        return false;
        
    }
}