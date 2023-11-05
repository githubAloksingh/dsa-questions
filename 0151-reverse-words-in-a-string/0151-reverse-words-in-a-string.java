class Solution {
    public String reverseWords(String s) {
        String []words=s.split(" ");
        StringBuilder reverse =new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            String word=words[i];
            if(!word.isEmpty()){
            reverse.append(word+" ");
            }
            
        }
        return reverse.toString().trim();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    
//     String[] words = s.split(" ");

    
//     StringBuilder reversed = new StringBuilder();

  
//     for (int i = words.length - 1; i >= 0; i--) {
//         String word = words[i];
//         if(!word.isEmpty()){
//             reversed.append(word+" ");
            
//         }
        
//     }

    
//     return reversed.toString().trim();
// }

//     }