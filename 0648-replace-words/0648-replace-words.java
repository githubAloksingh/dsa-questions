class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] wordArray = sentence.split(" ");
        Set<String> dicSet = new HashSet<>(dictionary);
        for(int i=0;i<wordArray.length;i++){
            wordArray[i]= shortestRoot(wordArray[i], dicSet);
        }
        return String.join(" ", wordArray);
    }
    private String shortestRoot(String word, Set<String>dictSet){
        for(int i=0;i<word.length();i++){
            String root = word.substring(0,i);
            if(dictSet.contains(root)){
            return root;
            }
        }
        return word;
    }
    
}
