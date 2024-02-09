class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int i=0;
        for(char val :key.toCharArray()){
            if(val!=' '){
                if(!map.containsKey(val)){
                    map.put(val,alphabet.charAt(i++));
               }
            }
        }
        StringBuilder result=new StringBuilder();
        for(char message_character:message.toCharArray()){
            if(message_character != ' '){
            result.append(map.get(message_character));
            }
            else{
                result.append(' ');
            }
        }
        return result.toString();
        
    }
}
