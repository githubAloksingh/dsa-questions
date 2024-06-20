class Solution {
    public int maxDistance(int[] position, int m) {
        int res=0;
        int n=position.length;
        Arrays.sort(position);
        int low=1;
        int answer=0;
        int high=(int)Math.ceil(position[n-1]/(m-1.0));
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canPlaceBalls(mid, position, m)){
                answer=mid;
                low=mid+1;
            }
            else{
            high=mid-1;
            }
        }
        return answer;
        
    }
    private boolean canPlaceBalls(int x, int []position, int m ){
        int prevBallPosition=position[0];
        int ballsPlaced=1;
        for(int i=1;i<position.length && ballsPlaced<m; i++){
            int currPos=position[i];
            if(currPos-prevBallPosition >=x){
                ballsPlaced+=1;
                prevBallPosition=currPos;
            }
        }
        return ballsPlaced==m;
        
    }
}
