class Solution {
    public int[] runningSum(int[] nums) {
        int runSum[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            runSum[i] = sum + nums[i];
            sum = sum + nums[i];
        }
        return runSum;
    }
}