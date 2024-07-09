class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double totalWait =0;
        int currTime=0;
        for(int vec[] :customers){
            int arrivalTime = vec[0];
            int cookTime = vec[1];
            if(currTime<arrivalTime){
                currTime = arrivalTime;
            }
            int waitTime = currTime+cookTime-arrivalTime;
            totalWait+=waitTime;
            currTime+=cookTime;
        }
        return totalWait/n;
    }
}