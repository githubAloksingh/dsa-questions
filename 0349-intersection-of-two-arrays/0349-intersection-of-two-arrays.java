class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int j=0;
    
        for(int num1:nums1){
            al.add(num1);
        }
        for(int num2:nums2){
            if(!ans.contains(num2) && al.contains(num2)){
                ans.add(num2);
            }
        }
        int result[]=new int [ans.size()];
        for(int res:ans){
            result[j++]=res;
        }
        return result;
        
    }
}