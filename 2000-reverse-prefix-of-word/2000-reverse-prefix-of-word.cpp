#include <iostream>
#include <stack>
class Solution {
public:
    std::string reversePrefix(std::string word, char ch) {
        stack<char> st;
        int temp = -1;
        for (int i = 0; i < word.size(); i++) {
            char c = word[i];
            if (c != ch) {
                st.push(c);
            } else {
                temp = i;
                break;
            }
        }
        if (temp != -1) {
            string newStr;
            string remainingString = word.substr(temp + 1);
            newStr.push_back(ch);
            while (!st.empty()) {
                newStr.push_back(st.top());
                st.pop();
            }
        
            return newStr.append(remainingString);
        }
        else {
            return word;
        }
    }
};