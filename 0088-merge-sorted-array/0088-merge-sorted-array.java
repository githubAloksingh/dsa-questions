class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //Solution 1
        int i=0,j=0,k=0;
        int arr[]=new int[m+n];
        while(i<m &&j<n){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
                }
                else{
                    arr[k++]=nums2[j++];
                    }
                    }
                    while(i<m){
                    arr[k++]=nums1[i++];
                    }
                    while(j<n){
                    arr[k++]=nums2[j++];
                    }
                    for(int a=0;a<m+n;a++){
                        nums1[a]=arr[a];
                    }
                    }
                    }

                    //Solution 2
                    // class Solution {
                    //     public void merge(int[] nums1, int m, int[] nums2, int n) {
                    //         ArrayList<Integer>al=new ArrayList<Integer>();
                    //         for(int i=0;i<m;i++){
                    //           al.add(nums1[i]);
                    //         }
                    //         for(int j=0;j<n;j++){
                    //           al.add(nums2[j]);
                    //         }
                    //         Collections.sort(al);
                    //         for(int i=0;i<(m+n);i++){
                    //         nums1[i]=al.get(i);
                    //         }
                    //     }
                    // }
    