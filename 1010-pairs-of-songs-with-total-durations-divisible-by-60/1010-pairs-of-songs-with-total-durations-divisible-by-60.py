class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        map = {}
        pairs=0
        
        for t in time:
            remainder = t%60
            complement=(60-remainder)%60
            
            if complement in map:
                pairs+=map[complement]
            map[remainder]=map.get(remainder,0)+1
        return pairs
        
        
  