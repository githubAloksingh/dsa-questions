class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n1=len(nums1)
        n2=len(nums2)
        n=n1+n2
        arr=[0]*(n1+n2)
        for i in range(n1):
            arr[i]=nums1[i]
        for i in range(n2):
            arr[i+n1]=nums2[i]
        arr.sort()
        if n%2!=0:
            val=(n+1)//2
            return arr[val-1]
        else:
            val = (arr[n//2-1]+arr[n//2])/2
            return val
                
    
