class Solution {
public:
    bool isNStraightHand(vector<int>& hand, int groupSize) {
        int handSize = hand.size();

        if (handSize % groupSize != 0) {
            return false;
        }
        map<int, int> cardCount;
        for (int i = 0; i < handSize; i++) {
            cardCount[hand[i]]++;
        }
        while (!cardCount.empty()) {
            int currentCard = cardCount.begin()->first;
            for (int i = 0; i < groupSize; i++) {
                if (cardCount[currentCard + i] == 0) {
                    return false;
                }
                cardCount[currentCard + i]--;
                if (cardCount[currentCard + i] < 1) {
                    cardCount.erase(currentCard + i);
                }
            }
        }

        return true;
    }
};