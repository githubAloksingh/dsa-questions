class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int temp = -1;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != ch) {
                st.push(c);
            } else {
                temp = i;
                break;
            }
        }
        if (temp != -1) {
            StringBuilder newStr = new StringBuilder();
            String remainingString = word.substring(temp + 1);
            newStr.append(ch);
            while (!st.isEmpty()) {
                newStr.append(st.pop());
            }
            return newStr.append(remainingString).toString();
        } else {
            return word;
        }
    }
}


