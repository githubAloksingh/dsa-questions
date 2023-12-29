class Solution {
public int minDifficulty(int[]jd,int d){
int n=jd.length;
if(n<d) return-1;
int[][]dp=new int[n+1][d+1] ;
Arrays.stream(dp).forEach(A->Arrays.fill (A,Integer.MAX_VALUE/2));
dp[0][0]=0;
for(int i=1;i<=n;++i)
for(int k=1;k<=d;++k){
int maxD=0;
for(int j=i-1;j>=k-1;--j){
maxD=Math.max(maxD,jd[j]);
dp[i][k]=Math.min (dp[i][k],dp[j][k-1]+maxD);
}
}
return dp[n][d];
}
}