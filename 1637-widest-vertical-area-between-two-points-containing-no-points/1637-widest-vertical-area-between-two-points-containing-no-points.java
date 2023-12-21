class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<points.length;i++){
            al.add(points[i][0]);
            
        }
        Collections.sort(al);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<al.size()-1;i++){
            int diff=al.get(i+1)-al.get(i);
            maxi=Math.max(maxi,diff);
            
        }
        return maxi;
    }
}