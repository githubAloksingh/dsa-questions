class Solution {
public:
    long long maximumHappinessSum(vector<int>& happiness, int k) {
        std::sort(happiness.begin(),happiness.end());
        int n = happiness.size();
        long long sum=0;
        int turns=0;
        for(int i=n-1;i>=n-k;i--){
            sum+=std::max(happiness[i]-turns,0);
            turns++;
        }
        return sum;
    }
};
