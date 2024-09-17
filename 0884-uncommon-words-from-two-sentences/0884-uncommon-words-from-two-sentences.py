class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        map={}
        for word in s1.split():
            if word in map:
                map[word]+=1
            else:
                map[word]=1
                
        for word in s2.split():
            if word in map:
                map[word]+=1
            else:
                map[word]=1
        res=[]
        for word in map:
            if map[word]==1:
                res.append(word)
        return res
        
        
        