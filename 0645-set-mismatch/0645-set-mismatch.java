class Solution {
    public int[] findErrorNums(int[] nums) {
        
        // int freq[] = new int[nums.length+1];
        // for (int i:nums) freq[i]++;
        // int dup = 0, miss = 0;
        // for (int i = 0; i <freq.length; i++) {
        //     if (freq[i]==2) dup = i;
        //     if (freq[i]==0) miss = i; 
        //     if (dup!=0 && miss!=0) break;
        // }
        // return new int[]{dup,miss};
        
        int n=nums.length;
        int dup=-1;
        int missing=-1;
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                dup=Math.abs(nums[i]);
            }
            else{
                nums[Math.abs(nums[i])-1]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                missing=i+1;
                break;
            }
        }
            return new int[]{dup,missing};
        }
    }


