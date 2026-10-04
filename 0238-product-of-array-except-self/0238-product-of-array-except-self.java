// Amazon, Apple, Blommberg


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = product;
            product = product * nums[i];
        }
        product = 1;
        for(int j = nums.length - 1; j >= 0; j--){
            left[j] = left[j] * product;
            product = product * nums[j];
        }
        return left;
    }
}