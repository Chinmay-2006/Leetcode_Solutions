class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // it is for array nums1
        int j = 0; // it is for array nums2
        int result[] = new int[m + n];
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                result[k] = nums1[i];
                k++;
                i++;
            } else{
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i < m){
            result[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n){
            result[k] = nums2[j];
            k++;
            j++;
        }
        for(int x = 0; x < m + n; x++){
            nums1[x] = result[x];
        }
    }
}