class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        totalSum=0
        for i in range(0,len(nums)):
            totalSum+=nums[i]
        
        
        leftSum=0
        for i in range(0, len(nums)):
            if leftSum==totalSum-leftSum-nums[i]:
                return i
            leftSum+=nums[i]
            
        return -1
    
            
        