class Solution {
public:
    long func(long firstHalf, bool isEven) {
        long resultNum = firstHalf;
        if (!isEven) {
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
        long firstHalf = stol(n.substr(0, firstHalfLength));
        
        vector<long> possibleResults;
        possibleResults.push_back(func(firstHalf, L % 2 == 0));
        possibleResults.push_back(func(firstHalf + 1, L % 2 == 0)); 
        possibleResults.push_back(func(firstHalf - 1, L % 2 == 0));
        possibleResults.push_back((long)pow(10, L - 1) - 1); 
        possibleResults.push_back((long)pow(10, L) + 1);        

        long diff = LONG_MAX;
        long result = -1;
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
