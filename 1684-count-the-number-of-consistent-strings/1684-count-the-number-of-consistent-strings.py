class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        is_allowed=[False]*26
        for char in allowed:
            is_allowed[ord(char)-ord('a')]=True
        count=0
        for word in words:
            consistent=True
            for char in word:
                if not is_allowed[ord(char)-ord('a')]:
                    consistent=False
                    break
            if consistent:
                count+=1
        return count
            
        