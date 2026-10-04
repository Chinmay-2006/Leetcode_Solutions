class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = product;
            product = product * nums[i];
        }
        product = 1;
        for(int j = nums.length - 1; j >= 0; j--){
            right[j] = product;
            product = product * nums[j];
        }
        for(int i = 0; i < nums.length; i++){
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
}