class Solution {
public:
    // This function generates a palindrome by mirroring the first half.
    long func(long firstHalf, bool isEven) {
        long resultNum = firstHalf;
        if (!isEven) {  // No need to compare with `false`, just use `!isEven`.
            firstHalf /= 10;
        }
        while (firstHalf > 0) {
            int digit = firstHalf % 10;
            resultNum = (resultNum * 10) + digit;
            firstHalf /= 10;
        }
        return resultNum;
    }

    string nearestPalindromic(string n) {
        int L = n.size();
        int mid = L / 2;
        int firstHalfLength = (L % 2 == 0) ? mid : (mid + 1);
        long firstHalf = stol(n.substr(0, firstHalfLength)); // Corrected the `firstHalfLength` typo
        
        vector<long> possibleResults;
        possibleResults.push_back(func(firstHalf, L % 2 == 0));       // Same palindrome.
        possibleResults.push_back(func(firstHalf + 1, L % 2 == 0));   // Increment the first half.
        possibleResults.push_back(func(firstHalf - 1, L % 2 == 0));   // Decrement the first half.
        possibleResults.push_back((long)pow(10, L - 1) - 1);          // Smallest number with L-1 digits, e.g., 999 for L=3.
        possibleResults.push_back((long)pow(10, L) + 1);              // Smallest number with L+1 digits, e.g., 10001 for L=5.

        long diff = LONG_MAX;
        long result = -1; // Use a placeholder different from INT_MAX.
        long originalNum = stol(n);
        
        for (long num : possibleResults) {
            if (num == originalNum) continue;
            if (abs(num - originalNum) < diff) {
                diff = abs(num - originalNum);
                result = num;
            } else if (abs(num - originalNum) == diff) {
                result = min(result, num);
            }
        }
        return to_string(result);
    }
};
