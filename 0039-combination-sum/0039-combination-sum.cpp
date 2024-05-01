class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> all;
        vector<int> partial;
        traverse(all,partial,candidates,0,target);
        return all;
    }
    
private:
    void traverse(vector<vector<int>>& all,
                  vector<int>& partial,
                  vector<int>& candidates,
                  int start,
                 int target){
        if(target==0){
            all.push_back(partial);
            return;
        }
        else{
            for(int j=start;j<candidates.size();j++){
                if(candidates[j]<=target){
                partial.push_back(candidates[j]);
                
                traverse(all,partial,candidates,j,target-candidates[j]);
                partial.pop_back();
    
            }
        }
        }
        
    }
};


      