class Solution {
    public int maxScore(String s) {
      char c[]=  s.toCharArray();
        int n=c.length;
        int maxi=Integer.MIN_VALUE;
        int count_0=0;
        int count_1=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(c[i]=='0'){
                count_0++;
            }
            for(int j=i+1;j<n;j++){
                 if(c[j]=='1'){
                 count_1++;
                 }
            }
            sum=count_0+count_1;
            count_1=0;
            maxi=Math.max(maxi,sum);
             }
             return maxi;
        
    }
}