class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        // vector<int> temp(nums.size());
        // for(int i=0;i<nums.size();i++){
        //     temp[(i+k)%nums.size()]=nums[i];
        // }
        // nums=temp;
        
        
        
         k = k % nums.size();
        reverse(nums.begin(), nums.end());
        reverse(nums.begin(), nums.begin() + k);
        reverse(nums.begin() + k, nums.end());    
    }
    
};