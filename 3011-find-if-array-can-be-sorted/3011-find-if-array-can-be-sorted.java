class Solution {
    public boolean canSortArray(int[] nums) {
        boolean swapped=true;
        int n=nums.length;
        for(int i=0;i<n;i++){
            swapped =false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]<=nums[j+1]){
                    continue;
                }
                else{
                    if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        swapped=true;
                    }
                    
                    
                    else{
                        return false;
                    }
                }
            }
            if(swapped==false){
                break;
            }
        }
        return true;
        
    }
}







// class Solution {
//     public boolean canSortArray(int[] nums) {
//         int n = nums.length;
//         boolean swapped = true;

//         for (int i = 0; i < n; i++) {
//             swapped = false;

//             for (int j = 0; j < n - i - 1; j++) { // in every pass, the max element bubbles up to the rightmost index
//                 if (nums[j] <= nums[j + 1]) {
//                     // no swap required
//                     continue;
//                 } else {
//                     // swap is required
//                     if (Integer.bitCount(nums[j]) == Integer.bitCount(nums[j + 1])) {
//                         // swapping nums[j] and nums[j + 1]
//                         int temp = nums[j];
//                         nums[j] = nums[j + 1];
//                         nums[j + 1] = temp;
//                         swapped = true;
//                     } else {
//                         // not able to swap, hence can't sort it
//                         return false;
//                     }
//                 }
//             }

//             if (!swapped) { // no swapping was done in the pass, hence array was already sorted
//                 break; // no more passes are required
//             }
//         }

//         return true;
//     }
// }