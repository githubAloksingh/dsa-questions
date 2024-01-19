class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int n1=nums1.length;
        int n2=nums2.length;
        int k=0;
        int result[]=new int[n1];
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            int val=nums1[i];
           ans=search(nums2,val);
           result[k++]=ans;
           
        }
        return result;
        }

        public int search(int []nums2,int val){
            for(int i=0;i<nums2.length;i++){
                if(nums2[i]==val){
                    for(int j=i;j<nums2.length;j++){
                        if(nums2[j]>val){
                            return nums2[j];
                        }
                    }
                }
            }
            return -1;
        }
    }



















