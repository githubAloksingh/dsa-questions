class Solution {
    public String[] findWords(String[] words) {
        String[] rows={"ASDFGHJKL","QWERTYUIOP","ZXCVBNM"};
         List<String> result = new ArrayList<>();
        for(String word : words){
            String upperWord=word.toUpperCase();
            if(isInRow(upperWord, rows)){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
    
    private boolean isInRow(String word,String[] rows){
        for(String row :rows ){
            boolean isInCurrentRow = true;
            for(char ch: word.toCharArray()){
                if(row.indexOf(ch)==-1){
                    isInCurrentRow = false;
                    break;
                }
            }
             if (isInCurrentRow==true) {
                 return true;
             }
      }
        return false;
    }
}


