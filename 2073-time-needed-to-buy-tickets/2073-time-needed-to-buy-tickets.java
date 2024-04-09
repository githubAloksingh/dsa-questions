class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int count =0;
        int i=0;
        while(tickets[k]!=0){
            if(tickets[i]!=0){
                count++;
                tickets[i]=tickets[i]-1;
            }
            i=(i+1)%n;
        }
        return count;
    }
}