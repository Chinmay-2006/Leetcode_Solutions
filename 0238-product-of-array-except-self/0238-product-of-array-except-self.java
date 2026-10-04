// Amazon, Apple, Blommberg
// ex: 1, 2, 3 , 4
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // take left product into left array = [1 (left[0] = 1), 1 (left[1] = 1), 2 , 6]
        int[] left = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = product;
            product = product * nums[i]; // product = 1 * 1 = 1, 1 * 2 = 2, 2 * 3 = 6, 6 * 4 = 24
        }
        product = 1;
        // take right product and multiply with left array we created
        for(int j = nums.length - 1; j >= 0; j--){
            left[j] = left[j] * product;
            product = product * nums[j];
        }
        return left;
    }
}