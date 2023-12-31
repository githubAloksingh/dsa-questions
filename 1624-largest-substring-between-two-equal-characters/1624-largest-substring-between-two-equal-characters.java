class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
       //Solution 1 BruteForce
       // int ans=-1;
       //  int n=s.length();
       //  for(int i=0;i<n;i++){
       //      for(int j=i+1;j<n;j++){
       //          if(s.charAt(i)==s.charAt(j)){
       //              ans=Math.max(ans,j-i-1);
       //          }
       //      }
       //  }
       //  return ans;
        
        int n=s.length();
        int maxi=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                maxi=Math.max(maxi,i-map.get(s.charAt(i))-1);
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        return maxi;
    }
}

