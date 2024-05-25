class Solution {
public:
    int maxScoreWords(vector<string>& words, vector<char>& letters, vector<int>& score) {
        int W = words.size();
        // Count how many times each letter occurs
        vector<int> freq(26, 0);
        for (char c : letters) {
            freq[c - 'a']++;
        }
        int maxScore = 0;
        // Iterate over every subset of words
        vector<int> subsetLetters(26, 0);
        for (int mask = 0; mask < (1 << W); mask++) {
            // Reset the subsetLetters array
            fill(subsetLetters.begin(), subsetLetters.end(), 0);
            for (int i = 0; i < W; i++) {
                if ((mask & (1 << i)) > 0) {
                    // Count the letters in this word
                    int L = words[i].length();
                    for (int j = 0; j < L; j++) {
                        subsetLetters[words[i][j] - 'a']++;
                    }
                }
            }
            maxScore = max(maxScore, subsetScore(subsetLetters, score, freq));
        }
        return maxScore;
    }

private:
    int subsetScore(vector<int>& subsetLetters, vector<int>& score, vector<int>& freq) {
        int totalScore = 0;
        // Calculate score of subset
        for (int c = 0; c < 26; c++) {
            totalScore += subsetLetters[c] * score[c];
            // Check if we have enough of each letter to build this subset of words
            if (subsetLetters[c] > freq[c]) {
                return 0;
            }
        }
        return totalScore;
    }
};