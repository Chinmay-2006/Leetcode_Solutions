class Solution {
    public boolean containsDuplicate(int[] nums) {
        // ...... sort the array ........
        Arrays.sort(nums);
        // loop 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}