class Solution {
public:
    int longestPalindrome(string s) {
        // Map to store frequency of occurrence of each character
        unordered_map<char, int> frequencyMap;
        // Count frequencies
        for (char c : s) {
            frequencyMap[c]++;
        }

        int res = 0;
        bool hasOddFrequency = false;
        for (auto& entry : frequencyMap) {
            int freq = entry.second;
            // Check if the frequency is even
            if (freq % 2 == 0) {
                res += freq;
            } else {
                // If the frequency is odd, one occurrence of the
                // character will remain without a match
                res += freq - 1;
                hasOddFrequency = true;
            }
        }
        // If hasOddFrequency is true, we have at least one unmatched
        // character to make the center of an odd length palindrome.
        if (hasOddFrequency) return res + 1;

        return res;
    }
};