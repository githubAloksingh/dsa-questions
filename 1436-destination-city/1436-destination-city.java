class Solution {
    public String destCity(List<List<String>> paths) {
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<paths.size();i++){
            al.add(paths.get(i).get(0));
            
        }
        for(int i=0;i<paths.size();i++){
            if(!al.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return null;
        
    }
}