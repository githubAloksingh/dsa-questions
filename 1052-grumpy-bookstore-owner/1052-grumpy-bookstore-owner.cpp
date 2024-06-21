class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int n = customers.size();
        int maxUnSatCust=0;
        int currUnSat=0;
        for(int i=0; i<minutes; i++){
             currUnSat+=customers[i]*grumpy[i];
        }
        maxUnSatCust=currUnSat;
        int i=0;
        int j=minutes;
        
        while(j<n){
            currUnSat+=customers[j]*grumpy[j];
            currUnSat-=customers[i]*grumpy[i];
            maxUnSatCust= max(maxUnSatCust, currUnSat);
            i++;
            j++;
        }
        int totalSat=maxUnSatCust;
        for(int i=0;i<n;i++){
            totalSat+=customers[i]*(1-grumpy[i]);
                
        }
        return totalSat;
    }
};