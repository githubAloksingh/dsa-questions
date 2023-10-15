class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
//        int n=nums.size();
//         set<int> st;
//         for(int i=0;i<n;i++){
//             st.insert(nums[i]);
//         }
//         int index=0;
//         for(auto it:st){
//             nums[index]=it;
//             index++;
//         }
          
//         return index;
          
        int i=0;
        for(int j=i+1;j<nums.size();j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
};