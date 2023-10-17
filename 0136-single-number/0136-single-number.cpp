class Solution {
public:
    int singleNumber(vector<int>& nums) {
          for(int i=0;i<nums.size();i++){
            int count=0;
            int m=nums[i];
            for(int j=0;j<nums.size();j++){
                if(nums[j]==m)
                    count++;
            }
            if (count==1)
                return m;
        }
        return -1;
    }
};