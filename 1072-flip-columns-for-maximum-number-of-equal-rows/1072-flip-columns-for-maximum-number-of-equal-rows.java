class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> map =new HashMap<>();
        for(int row[]: matrix){
            
            StringBuilder val = new StringBuilder();
            StringBuilder rev = new StringBuilder();
            for(int r: row){
                val.append(r);
                rev.append(1-r);
            }
            String sVal=val.toString();
            String sRev=rev.toString();
            map.put(sVal, map.getOrDefault(sVal,0)+1);
            map.put(sRev, map.getOrDefault(sRev,0)+1);


        }int maxi=0;
        for(Map.Entry<String, Integer>entry: map.entrySet()){
            int value=entry.getValue();
            maxi=Math.max(maxi, value);
        }
        return maxi;
        
    }
}